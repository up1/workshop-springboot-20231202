package com.example.day01;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private boolean isExistingUserInDb(String firstName) {
        // TODO :: check from database
        return "dummy".equals(firstName);
    }

    public UserResponse createNewUser(UserRequest userRequest) {
        // Process ?
        if(isExistingUserInDb(userRequest.getFirst_name())) {
            throw new UserExistedException("User existed");
        }

        // Ok
        // TODO :: Create a new User into database

        // Return response
        UserResponse response = new UserResponse();
        response.setFirst_name(userRequest.getFirst_name());
        response.setLast_name(userRequest.getLast_name());
        response.setAge(userRequest.getAge());
        response.setId(100);
        return response;
    }



}
