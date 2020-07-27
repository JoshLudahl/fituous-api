package com.fituous.api;

public class Status {

    private int status;
    private String message;

    public Status(int status, String message) {
        this.status = status;
        this.message = message;
    }


    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
