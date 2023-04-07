package main.sqch11ex1.advices;

import main.sqch11ex1.exceptions.NotEnoughMoneyException;
import main.sqch11ex1.model.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice

public class ExceptionControllerAdvice {
    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler() {
        ErrorDetails error = new ErrorDetails();
        error.setMessage("Not enough money");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(error);
    }
}
