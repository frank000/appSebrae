package com.example.AppSebra.app.web.config;

import com.example.AppSebra.app.web.exception.NotValidException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
@RestController
public class ControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NotValidException.class)
    public ResponseEntity<String> notValidHandler(NotValidException e){

        return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

}
