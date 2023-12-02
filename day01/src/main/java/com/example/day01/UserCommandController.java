package com.example.day01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCommandController {

    @PostMapping(path="/users")
    public UserResponse createNewUser(
            @RequestBody UserRequest userRequest) {
        // Request
        System.out.println(userRequest);
        // Validate requests
        // Do sth :: TODO Next
        // Generate Response
        UserResponse response = new UserResponse();
        response.setFirst_name(userRequest.getFirst_name());
        response.setLast_name(userRequest.getLast_name());
        response.setAge(userRequest.getAge());
        response.setId(100);
        return response;
    }

}
