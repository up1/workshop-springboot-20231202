package com.example.day01.users;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserControllerAdvice {

    @ExceptionHandler(UserExistedException.class)
    public ResponseEntity<ErrorMessage> handleFirstCase(UserExistedException e) {
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setMessage(e.getMessage());
        ResponseEntity<ErrorMessage> response
                = new ResponseEntity<>(errorMessage,
                HttpStatusCode.valueOf(202));
        return response;
    }

}
