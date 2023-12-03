package com.example.day01;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserControllerAdvice {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleFirstCase(Exception e) {
        ResponseEntity<String> response
                = new ResponseEntity<>("Error", HttpStatusCode.valueOf(202));
        return response;
    }

}
