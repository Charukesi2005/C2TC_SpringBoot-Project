package com.tnif.onetomanymapping.entity.exception;

public class CustomerNotFoundException extends RuntimeException {
	// Constructor accepting a custom message
    public CustomerNotFoundException(String message) {
        super(message);
    }
}