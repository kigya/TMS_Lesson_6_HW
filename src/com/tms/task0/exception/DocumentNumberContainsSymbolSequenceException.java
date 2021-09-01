package com.tms.task0.exception;

public class DocumentNumberContainsSymbolSequenceException extends Exception {
    private String documentNumber;

    public String getDocumentNumber() {
        return documentNumber;
    }

    public DocumentNumberContainsSymbolSequenceException(String message, String documentNumber) {
        super(message);
        this.documentNumber = documentNumber;
    }

}
