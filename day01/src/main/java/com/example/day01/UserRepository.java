package com.example.day01;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<MyUser, Integer> {

    Optional<MyUser> findByFirstName(String fname);

}
