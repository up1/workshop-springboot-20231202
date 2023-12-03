package com.example.day01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void insertData() {
        MyUser myUser = new MyUser();
        myUser.setFirstName("demo name");
        myUser = userRepository.save(myUser);
        assertEquals(1, myUser.getId());
    }

}