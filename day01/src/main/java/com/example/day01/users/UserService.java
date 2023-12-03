package com.example.day01.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private boolean isExistingUserInDb(String firstName) {
        Optional<MyUser> result = userRepository.findByFirstName(firstName);
        return result.isPresent();
    }

    @Transactional
    public UserResponse createNewUser(UserRequest userRequest) {
        if(isExistingUserInDb(userRequest.getFirst_name())) {
            throw new UserExistedException("User existed");
        }
        MyUser newUser = new MyUser();
        newUser.setFirstName(userRequest.getFirst_name());
        newUser.setLastName(userRequest.getLast_name());
        newUser.setAge(userRequest.getAge());
        newUser = userRepository.save(newUser);

//        userRepository.deleteAll();

        // Return response
        UserResponse response = new UserResponse();
        response.setId(newUser.getId());
        response.setFirst_name(newUser.getFirstName());
        response.setLast_name(newUser.getLastName());
        response.setAge(newUser.getAge());
        return response;
    }



}
