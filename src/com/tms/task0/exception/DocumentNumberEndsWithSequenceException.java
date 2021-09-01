package com.tms.task0.exception;

public class DocumentNumberEndsWithSequenceException extends Exception{

    String documentNumber;

    public String getDocumentNumber() {
        return documentNumber;
    }

    public DocumentNumberEndsWithSequenceException(String message, String documentNumber) {
        super(message);
        this.documentNumber = documentNumber;
    }

}
