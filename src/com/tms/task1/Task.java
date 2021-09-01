package com.tms.task1;

import com.tms.task1.exception.WrongLoginException;
import com.tms.task1.exception.WrongPasswordException;
import org.jetbrains.annotations.NotNull;

public class Task {

    static boolean checkAccountData(@NotNull String login, String password, String confirmPassword) {
        try {
            if (login.length() > 19 || login.contains(" ")) {
                throw new WrongLoginException("Wrong login!", login);
            }
        } catch (WrongLoginException e) {
            System.out.println("Exception: "
                    .concat(e.getMessage())
                    .concat("\nLogin: ")
                    .concat(e.getLogin()));
            e.printStackTrace();
        }
        try {
            if (password.length() > 19 || password.contains(" ") || !password.matches(".*\\d.*")) {
                throw new WrongPasswordException("Wrong password!", password);
            }

        } catch (WrongPasswordException e) {
            System.out.println("Exception: "
                    .concat(e.getMessage())
                    .concat("\nPassword: ")
                    .concat(e.getPassword()));
            e.printStackTrace();
        }
        return password.equals(confirmPassword);
    }

}
