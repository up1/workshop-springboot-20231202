package com.example.day01.users;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/") // GET /users/
    public List<UserResponse> getAll() {
        System.out.println("Get all");
        return null;
    }

    @GetMapping("/{id}") // GET /users/1
    public UserResponse getUserById(@PathVariable int id) {
        System.out.println("GET /users/1");
        return null;
    }

    @GetMapping("")  // GET /users?id=1
    public UserResponse
        getUserByIdWithParams(@RequestParam(defaultValue = "0") int id) {
        System.out.println("GET /users?id=1");
        return null;
    }


}
