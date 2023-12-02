package com.example.day01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public HelloResponse sayHello() {
        HelloResponse response = new HelloResponse();
        response.setMessage("Hello Spring Boot");
        return  response;
    }

}
