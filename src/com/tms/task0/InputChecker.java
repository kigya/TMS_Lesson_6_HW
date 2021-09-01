package com.tms.task0;

import java.util.Scanner;

class InputChecker {

    static String enterValidDocumentNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter document number in format xxxx-yyy-xxxx-yyy-xyxy: ");
        StringBuilder stringBuilder;
        boolean key = true;
        do {
            stringBuilder = new StringBuilder(scanner.nextLine());
            if (!stringBuilder.toString()
                    .matches("[0-9]{4}[-][a-zA-Z]{3}[-][0-9]{4}[-][a-zA-Z]{3}[-]\\d\\D\\d\\D")) {
                System.out.println("Invalid format! Try again!");
            } else {
                key = false;
            }
        } while (key);
        return stringBuilder.toString();
    }

}
