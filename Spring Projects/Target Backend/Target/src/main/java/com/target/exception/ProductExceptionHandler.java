package com.target.exception;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionHandler {

	@ExceptionHandler(value = { ProductNotFound.class })
	public ResponseEntity<Object> handleProductPostException(ProductNotFound e) {
		HttpStatus notFound = HttpStatus.NOT_FOUND;
		ProductException productException = new ProductException(e.getMessage(), e, notFound,
				ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
		return new ResponseEntity<>(productException, notFound);
	}

	@ExceptionHandler(value = { ProductTypeMismatch.class })
	public ResponseEntity<Object> handleProductTypeException(ProductTypeMismatch e) {
		HttpStatus badRequest = HttpStatus.BAD_REQUEST;
		ProductException productException = new ProductException(e.getMessage(), e, badRequest,
				ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
		return new ResponseEntity<>(productException, badRequest);
	}

}
