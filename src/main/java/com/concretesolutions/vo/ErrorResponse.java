package com.concretesolutions.vo;


public class ErrorResponse extends Response {

    private final String message;

    public ErrorResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
