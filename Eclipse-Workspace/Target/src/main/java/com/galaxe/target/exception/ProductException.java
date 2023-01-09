package com.galaxe.target.exception;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;

public class ProductException {

	private final String message;
	private final Throwable throwable;
	private final HttpStatus httpStatus;
	private final ZonedDateTime timeStamp;

	public ProductException(String message, Throwable throwable, HttpStatus httpStatus, ZonedDateTime timeStamp) {
		super();
		this.message = message;
		this.throwable = throwable;
		this.httpStatus = httpStatus;
		this.timeStamp = timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public Throwable getThrowable() {
		return throwable;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public ZonedDateTime getTimeStamp() {
		return timeStamp;
	}

}
