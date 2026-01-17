package com.sugarfit.starter.exception;



import java.time.Instant;
import java.util.Map;

public class ApiErrorResponse {

    private String message;
    private Instant timestamp;
    private Map<String, String> errors;

    public ApiErrorResponse() {}

    public ApiErrorResponse(String message, Instant timestamp, Map<String, String> errors) {
        this.message = message;
        this.timestamp = timestamp;
        this.errors = errors;
    }

    public String getMessage() {
        return message;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }
}
