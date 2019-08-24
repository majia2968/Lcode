package com.agile.practice.mockito.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertEquals;

@Service
public class UserService {

    private NameService nameService;

    @Autowired
    public UserService(NameService nameService) {
        this.nameService = nameService;
    }

    public String getUserName(String id) {
        return nameService.getUserName(id);
    }

    public String getDstClinicalSvcList() {
        RestTemplate restTemplate = makeRestTemplate();
        String fooResourceUrl = "http://localhost:8080/spring-rest/foos";
        ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl + "/1", String.class);
        if (response.getBody().equals("hello")) {
            return "Ok, hello";
        }
        else {
            return response.getBody();
        }
        //assertEquals(response.getStatusCode(), HttpStatus.OK);
    }

    protected RestTemplate makeRestTemplate() {
        return new RestTemplate();
    }

    public String getPrivate() {
        if (isEmpty()) return "Public";
        return "private";
    }

    private boolean isEmpty() {
        return false;
    }
}
