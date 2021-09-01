package com.tms.task1.exception;

public class WrongLoginException extends Exception {

    String login;

    public WrongLoginException() {
    }

    public WrongLoginException(String message, String login) {
        super(message);
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

}
