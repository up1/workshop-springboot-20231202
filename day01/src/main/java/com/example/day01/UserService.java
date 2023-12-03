package com.example.day01;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserResponse createNewUser(UserRequest userRequest) {
        // Process ?
        // Return response
        UserResponse response = new UserResponse();
        response.setFirst_name(userRequest.getFirst_name());
        response.setLast_name(userRequest.getLast_name());
        response.setAge(userRequest.getAge());
        response.setId(100);
        return response;
    }

}
