package com.galaxetheater.exceptions;

/*
 * Custom Exception thrown when there is no Content to be shown
 */
public class MovieNotFound extends Exception {

	/*
	 * First Super Class Constructor
	 */
	public MovieNotFound() {
		// TODO Auto-generated constructor stub
	}

	public MovieNotFound(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/*
	 * Last Super Class Constructor
	 */
	public MovieNotFound(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public MovieNotFound(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MovieNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
