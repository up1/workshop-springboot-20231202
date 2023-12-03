package com.example.day01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCommandController {

    @Autowired
    private UserService userService;

    @PostMapping(path="/users")
    public UserResponse createNewUser(
            @RequestBody UserRequest userRequest) {
        // Request
        // Validate requests
        // Do sth :: TODO Next
        // Generate Response
        return userService.createNewUser(userRequest);
    }

}
