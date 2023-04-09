package com.example.todo.models;

public class ErrorDetails {
    private String message;

    @Override
    public String toString() {
        return "Error{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
