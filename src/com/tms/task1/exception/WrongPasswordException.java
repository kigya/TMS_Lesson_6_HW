package com.tms.task1.exception;

public class WrongPasswordException extends Exception{

    String password;

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message, String login) {
        super(message);
        this.password = login;
    }

    public String getPassword() {
        return password;
    }
}
