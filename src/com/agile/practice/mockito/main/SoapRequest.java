package com.agile.practice.mockito.main;

import org.apache.tomcat.util.http.fileupload.IOUtils;

/**
 * Created by xuefengluo on 8/7/19.
 */
public class SoapRequest {

    private ServiceConfig serviceConfig;
    private static final Logger logger = LoggerFactory.getLogger(MviDataService.class);

    @Autowired
    public MviDataService(ServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
    }

    /**
     * Service to get the Patient ICN by given the SSN from MVI
     *
     * @param patient patient
     * @return PatientIcn
     */
    public PatientIcn getPatientIcn(PatientInfo patient) {
        if (serviceConfig.getMock().equals("mock")) return getPatientIcnMock(patient);
        PatientIcn patientIcn = new PatientIcn();

        SoapClient service = getSoapClient();
        String extension = "MCID-200DSTV-" + UUID.randomUUID().toString();
        GetIdsRequestBuilder requestBuilder = new GetIdsRequestBuilder("1.2.840.114350.1.13.0.1.7.1.1", extension,
                "200DSTV", patient);
        Message request = requestBuilder.build();
        Message response;
        try {
            response = request.send(service);
        } catch (Exception e) {
            logger.error("Sending Request Exception Here: " + e.getMessage());
            throw new DstException(e.getMessage(), e);
        }
        GetIdsResponse idsResponse = new GetIdsResponse(response);
        idsResponse.processMessage();
        PatientCorrelationId[] patientCorrelationIds = idsResponse.getIds();
        if (patientCorrelationIds == null) {
            patientIcn.setErrored(true);
            return patientIcn;
        }
        String icn = getIcn(patientCorrelationIds);
        if ("Not Found".equals(icn) || "Multiple Icns".equals(icn)) {
            patientIcn.setErrored(true);
        }
        patientIcn.setIcn(icn);
        return patientIcn;
    }

    public PatientIcn getPatientIcnMock(PatientInfo patientInfo) {
        PatientIcn patientIcn = new PatientIcn();
        patientIcn.setErrored(true);
        Resource resource = new ClassPathResource("patient-identifier.json");
        try (InputStream inputStream = resource.getInputStream()) {
            Reader reader = new InputStreamReader(inputStream, "UTF-8");
            PatientInfo[] patientInfos = new Gson().fromJson(reader, PatientInfo[].class);
            for (PatientInfo p : patientInfos) {
                if (p.getSsn().equals(patientInfo.getSsn())) {
                    patientIcn.setErrored(false);
                    patientIcn.setIcn(p.getIcn());
                    return patientIcn;
                }
            }
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
        return patientIcn;
    }

    public String getIcn(PatientCorrelationId[] patientCorrelationIds) {
        String icn = "Not found";
        int i = 0;
        for (PatientCorrelationId patientCorrelationId : patientCorrelationIds) {
            /**
             * The ids contain ^NI^ and ^USVHA^ as a valid ICN. The fix is ensure the right
             * ICN contains NI and USVHA which have been handle in the code surrounding
             * with space instead of ^, so the pattern like VICNINSU1 will not be treated
             * like a valid ICN.
             */
            if (patientCorrelationId.toString().contains(" NI ") && patientCorrelationId.toString().contains(" USVHA ")) {
                icn = patientCorrelationId.toString().split(" ")[0];
                i++;
            }
        }
        if (i == 0) {
            return "Not Found";
        } else {
            return i == 1 ? icn : "Multiple Icns";
        }
    }

    public SoapClient getSoapClient() {
        String configFolder = serviceConfig.getMviCertPath();
        String enocdeConfigFolder = UriUtils.encodeFragment(configFolder, StandardCharsets.UTF_8.displayName());
        String jksFileName = serviceConfig.getMviCerts();
        String enocdeJksFileName = UriUtils.encodeFragment(jksFileName, StandardCharsets.UTF_8.displayName());
        File jksFile = new File(enocdeConfigFolder, enocdeJksFileName);
        FileSystemResource jksResource = new FileSystemResource(jksFile);

        //final Resource resourceKeyStore = new ClassPathResource(serviceConfig.getMviCerts());
        File keystore = null;
        SSLConfig sslConfig = new SSLConfig();
        // It need to refactoring later
        InputStream inputStreamKey = null;
        try {
            inputStreamKey = jksResource.getInputStream();
            keystore = File.createTempFile("keystore", ".jks");
            FileUtils.copyInputStreamToFile(inputStreamKey, keystore);
        } catch (IOException e) {
            logger.error("IOException here: " + e.getMessage());
        } finally {
            IOUtils.closeQuietly(inputStreamKey);
        }
        try {
            sslConfig.setKeystorePassword(serviceConfig.getMviKeyStorePass());
            if (keystore != null)
                sslConfig.setKeystorePath(keystore.getPath());
            sslConfig.setKeyPassword(serviceConfig.getMviKeyStorePass());
            if (keystore != null)
                sslConfig.setTruststorePath(keystore.getPath());
            sslConfig.setTruststorePassword(serviceConfig.getMviKeyStorePass());
        } catch (Exception e1) {
            logger.error("Exception here: " + e1.getMessage());
            throw e1;
        }

        SoapClient service = null;
        try {
            service = new SoapClient(serviceConfig.getMviEndpointUrl(), 50000, 600000, sslConfig);
        } catch (KeystoreInitializationException e) {
            e.printStackTrace();
        }
        return service;
    }

}
