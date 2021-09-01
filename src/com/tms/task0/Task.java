package com.tms.task0;

/**
 * This class contains methods from the task
 */
public class Task {

    static String returnTwoFirstNumberBlocksInString(String string) {
        return string.substring(0, 4).concat(string.substring(9, 13));
    }

    static String returnReplacedThreeWordBlocks(String string) {
        return string.replaceAll("[a-zA-Z]{3}", "   ");
    }

    static String returnWordsFromDocumentNumber (String string) {
        String[] stringArray = string.split("-");
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = stringArray[i].replaceAll("[0-9]", "");
        }
        return String.join("/", stringArray)
                .replaceAll("//", "/")
                .substring(1)
                .toLowerCase();
    }

    static String returnWordsFromDocumentNumberInFormat (String string) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray = string.replaceAll("[0-9]", "").split("-");
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].matches("[a-zA-Z]{2,4}")) {
                stringBuilder.append(stringArray[i]);
                if (i != stringArray.length - 1) {
                    stringBuilder.append("/");
                }
            }
        }
        return "Letters: ".concat(stringBuilder.toString().toUpperCase());
    }

    static String isContainsSubstring (String string) {
        return string.toLowerCase().contains("abc") ? "Yes" : "No";
    }

    static String isStartsWithSubstring(String string) {
        return string.startsWith("555") ? "Yes" : "No";
    }

    static String isEndsWithSubstring(String string) {
        return string.endsWith("1a2b") ? "Yes" : "No";
    }

}
