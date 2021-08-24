package com.udomsin.review.exceptioncontroller;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;

@ControllerAdvice
public class GlobalControllerExceptionHandler {
	@ResponseStatus(HttpStatus.GATEWAY_TIMEOUT)
	@ExceptionHandler(java.lang.ArithmeticException.class)
	
	public void handleDatabaseNotStart() {
		System.out.println("Arithmetic Exception");
	}
}
