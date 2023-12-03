package com.example.day01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserCommandControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    void createNewUserNewExistingUser() {
        UserRequest request = new UserRequest();
        request.setFirst_name("dummy");
        ResponseEntity<ErrorMessage> response
                = restTemplate.postForEntity("/users", request, ErrorMessage.class);
        assertEquals(202, response.getStatusCode().value());
        assertEquals("User existed", response.getBody().getMessage());
    }

    @Test
    void createNewUser() {
        UserRequest request = new UserRequest();
        request.setFirst_name("Somkiat");
        UserResponse response
                = restTemplate.postForObject("/users", request, UserResponse.class);
        assertEquals(100, response.getId());
        assertEquals("Somkiat", response.getFirst_name());
        // XXX
        UserResponse expected = new UserResponse();
        expected.setId(100);
        expected.setFirst_name("Somkiat");
        assertEquals(expected, response);
    }
}