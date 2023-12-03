package com.example.day01.payments;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello2")
    public ResponseEntity<HelloResponse> sayHello2() {
        HelloResponse response = new HelloResponse();
        response.setMessage("Hello Spring Boot");
        ResponseEntity<HelloResponse> r
                = new ResponseEntity<>(response, HttpStatusCode.valueOf(201));
        return  r;
    }

    @GetMapping("/hello")
    public HelloResponse sayHello() {
        HelloResponse response = new HelloResponse();
        response.setMessage("Hello Spring Boot");
        return  response;
    }

}
