package com.example.day01;

import com.example.day01.users.ErrorMessage;
import com.example.day01.users.UserRequest;
import com.example.day01.users.UserResponse;
import com.example.day01.users.MyUser;
import com.example.day01.users.UserRepository;
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

    @Autowired
    private UserRepository userRepository;

    @Test
    void createNewUserNewExistingUser() {
        // Mock data for dummy user in database
        MyUser myUser = new MyUser();
        myUser.setFirstName("dummy");
        userRepository.save(myUser);

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
        assertEquals(1, response.getId());
        assertEquals("Somkiat", response.getFirst_name());
        // XXX
        UserResponse expected = new UserResponse();
        expected.setId(1);
        expected.setFirst_name("Somkiat");
        assertEquals(expected, response);
    }
}