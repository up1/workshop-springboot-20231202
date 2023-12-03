package com.example.day01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

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
        MyUser newUser = new MyUser();
        newUser.setFirstName(userRequest.getFirst_name());
        newUser.setLastName(userRequest.getLast_name());
        newUser.setAge(userRequest.getAge());
        newUser = userRepository.save(newUser);

        // Return response
        UserResponse response = new UserResponse();
        response.setId(newUser.getId());
        response.setFirst_name(newUser.getFirstName());
        response.setLast_name(newUser.getLastName());
        response.setAge(newUser.getAge());
        return response;
    }



}
