package com.example.Tasklist.domain.exception;
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message) {

        super(message);
    }

}
