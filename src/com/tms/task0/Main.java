/**
 * 0. Доработать нулевое домашнее задание предыдущего урока.
 * Теперь надо создать свои классы исключений на каждую ситуацию:
 * - Проверить содержит ли номер документа последовательность abc.
 * - Проверить начинается ли номер документа с последовательности 555.
 * - Проверить заканчивается ли номер документа на последовательность 1a2b.
 * <p>
 * Если номер документа не удовлетворяет условию - то "бросить" исключение.
 * В методе класса, в котором будут вызываться эти методы для демонстрации работы,
 * перехватить исключение конструкцией try-catch и в блоке catch вывести сообщение для пользователя(сообщение на консоль).
 */

package com.tms.task0;

import com.tms.task0.exception.DocumentNumberContainsSymbolSequenceException;
import com.tms.task0.exception.DocumentNumberEndsWithSequenceException;
import com.tms.task0.exception.DocumentNumberStartsWithSequenceException;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        String documentNumber = InputChecker.enterValidDocumentNumber();
        try {
            if (!documentNumber.contains("abc")) {
                throw new DocumentNumberContainsSymbolSequenceException("Doesn't contain \"abc\" sequence!",
                        documentNumber);
            }
        } catch (DocumentNumberContainsSymbolSequenceException e) {
            System.out.println("Exception: "
                    .concat(e.getMessage())
                    .concat("\nDocument number: ")
                    .concat(e.getDocumentNumber()));
            e.printStackTrace();
            counter++;
        }
        try {
            if (!documentNumber.startsWith("555")) {
                throw new DocumentNumberStartsWithSequenceException("Doesn't start with \"555\"",
                        documentNumber);
            }
        } catch (DocumentNumberStartsWithSequenceException e) {
            System.out.println("Exception: "
                    .concat(e.getMessage())
                    .concat("\nDocument number: ")
                    .concat(e.getDocumentNumber()));
            e.printStackTrace();
            counter++;
        }
        try {
            if (!documentNumber.endsWith("1a2b")) {
                throw new DocumentNumberEndsWithSequenceException("Doesn't end with \"1a2b\"",
                        documentNumber);
            }
        } catch (DocumentNumberEndsWithSequenceException e) {
            System.out.println("Exception: "
                    .concat(e.getMessage())
                    .concat("\nDocument number: ")
                    .concat(e.getDocumentNumber()));
            e.printStackTrace();
            counter++;
        }
        if (counter != 0) {
            System.exit(404);
        } else {
            System.out.println(Task.returnTwoFirstNumberBlocksInString(documentNumber));
            System.out.println(Task.returnReplacedThreeWordBlocks(documentNumber));
            System.out.println(Task.returnWordsFromDocumentNumber(documentNumber));
            System.out.println(Task.returnWordsFromDocumentNumberInFormat(documentNumber));
            System.out.println(Task.isContainsSubstring(documentNumber));
            System.out.println(Task.isStartsWithSubstring(documentNumber));
            System.out.println(Task.isEndsWithSubstring(documentNumber));
        }
    }

}
