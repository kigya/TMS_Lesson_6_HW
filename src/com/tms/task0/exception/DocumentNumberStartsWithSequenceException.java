package com.tms.task0.exception;

public class DocumentNumberStartsWithSequenceException extends Exception {

    private String documentNumber;

    public String getDocumentNumber() {
        return documentNumber;
    }

    public DocumentNumberStartsWithSequenceException(String message, String documentNumber) {
        super(message);
        this.documentNumber = documentNumber;
    }

}
