package com.example.day01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("")
    public List<UserResponse> getAll() {
        return null;
    }

    @GetMapping("/{id}")
    public UserResponse getUserById(@PathVariable int id) {
        return null;
    }


}
