package com.tnif.onetoonemapping.controller.entity.exception;

public class UserNotFoundException extends RuntimeException{
	public UserNotFoundException(String message) {
        super(message);
    }
}