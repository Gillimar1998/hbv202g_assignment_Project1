package org.example;

public class UserOrBookDoesNotExistException extends Exception {
    public UserOrBookDoesNotExistException(String message) {
        super(message);
    }
}
