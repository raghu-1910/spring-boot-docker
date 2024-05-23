package com.customer.management.exception;

public class CustomerUpdateException extends RuntimeException {
    public CustomerUpdateException(String message, Throwable cause) {
        super(message, cause);
    }
}
