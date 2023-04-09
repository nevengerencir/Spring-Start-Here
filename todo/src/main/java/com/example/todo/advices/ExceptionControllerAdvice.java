package com.example.todo.advices;

import com.example.todo.exceptions.WrongPathException;
import com.example.todo.models.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(WrongPathException.class)
    public ResponseEntity<ErrorDetails> WrongPathExceptionHandler(){
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Wrong path, please check if you have an actual id in your HTTP request.");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(errorDetails);
    }
}
