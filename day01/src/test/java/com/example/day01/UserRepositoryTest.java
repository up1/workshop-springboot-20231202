package com.example.day01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findExistingUser() {
        // Save
        MyUser myUser = new MyUser();
        myUser.setFirstName("demo name");
        myUser = userRepository.save(myUser);

        // Find
        Optional<MyUser> result = userRepository.findByFirstName("demo name");
        assertEquals("demo name", result.get().getFirstName());
    }

    @Test
    public void insertData() {
        MyUser myUser = new MyUser();
        myUser.setFirstName("demo name");
        myUser = userRepository.save(myUser);
        assertEquals(1, myUser.getId());
    }

}