package com.example.day01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCommandController {

    @PostMapping("/users")
    public UserResponse createNewUser(
            @RequestBody UserRequest userRequest) {
        System.out.println(userRequest);
        return new UserResponse();
    }

}
