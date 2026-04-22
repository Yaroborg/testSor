package org.example.tasklist_lisow.domain.exception;

public class ResourseNotFoundException extends RuntimeException{

    public ResourseNotFoundException(String message) {
        super(message);
    }
}
