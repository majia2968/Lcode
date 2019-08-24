package com.agile.practice.mockito.test;

import com.agile.practice.mockito.main.NameService;
import com.agile.practice.mockito.main.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.mockito.ArgumentMatchers.anyString;

@RunWith(SpringRunner.class)
public class UserTests {

    @InjectMocks
    private UserService userService;
    @Mock
    private NameService nameService;
    @Spy
    private RestTemplate restTemplate;

    @Test
    public void whenUserIdIsProvided_thenRetrievedNameIsCorrect() {
        Mockito.when(nameService.getUserName("SomeId")).thenReturn("Mock user name");
        String testName = userService.getUserName("SomeId");
        Assert.assertEquals("Mock user name", testName);
    }

    @Test
    public void testRest() {
        Mockito.when(restTemplate.getForEntity(
                ArgumentMatchers.anyString(),
                ArgumentMatchers.any()
                )).thenReturn(new ResponseEntity<Object>("hello", HttpStatus.ACCEPTED));
        String result = userService.getDstClinicalSvcList();
        Assert.assertEquals("Ok, hello", result);
    }

    @Test
    public void testRestNegative() {

        Mockito.when(restTemplate.getForEntity(
                ArgumentMatchers.anyString(),
                ArgumentMatchers.any()
        )).thenReturn(new ResponseEntity<Object>("not hello", HttpStatus.ACCEPTED));
        String result = userService.getDstClinicalSvcList();
        Assert.assertEquals("not hello", result);
    }
}
