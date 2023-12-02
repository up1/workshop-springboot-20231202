package com.example.day01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    @DisplayName("เรากำลังทดสอบ hello world อยู่นะ")
    void sayHello() {
        HelloResponse result
                = restTemplate.getForObject("/hello", HelloResponse.class);
        assertEquals("Hello Spring Boot", result.getMessage());
    }

    @Test
    void sayHello2() {
        ResponseEntity<HelloResponse> result
                = restTemplate.getForEntity("/hello2", HelloResponse.class);
        assertEquals(201, result.getStatusCode().value());
        assertEquals("Hello Spring Boot", result.getBody().getMessage());
    }
}