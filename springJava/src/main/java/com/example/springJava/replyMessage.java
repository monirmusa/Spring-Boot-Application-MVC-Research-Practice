package com.example.springJava;

public class replyMessage {
    public String errorMessage;
    public String StatusCode;

    public replyMessage() {
    }

    public replyMessage(String errorMessage, String statusCode) {
        this.errorMessage = errorMessage;
        StatusCode = statusCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(String statusCode) {
        StatusCode = statusCode;
    }
}
