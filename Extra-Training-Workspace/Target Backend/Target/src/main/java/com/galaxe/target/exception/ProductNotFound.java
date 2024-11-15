package com.galaxe.target.exception;

public class ProductNotFound extends Exception {

	public ProductNotFound() {
	}

	public ProductNotFound(String message) {
		super(message);
	}

	public ProductNotFound(Throwable cause) {
		super(cause);
	}

	public ProductNotFound(String message, Throwable cause) {
		super(message, cause);
	}

	public ProductNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
