package com.galaxe.target.exception;

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

	@ExceptionHandler(value = { UserAlreadyExists.class })
	public ResponseEntity<Object> handleUserAlreadyExistsException(UserAlreadyExists e) {
		HttpStatus notAcceptable = HttpStatus.NOT_ACCEPTABLE;
		ProductException productException = new ProductException(e.getMessage(), e, notAcceptable,
				ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
		return new ResponseEntity<>(productException, notAcceptable);
	}

	@ExceptionHandler(value = { UserNotFound.class })
	public ResponseEntity<Object> handleUserNotFoundException(UserNotFound e) {
		HttpStatus notFound = HttpStatus.NOT_FOUND;
		ProductException productException = new ProductException(e.getMessage(), e, notFound,
				ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
		return new ResponseEntity<>(productException, notFound);
	}

	@ExceptionHandler(value = { NoSuchItemInCartExists.class })
	public ResponseEntity<Object> handleNoSuchItemInCartExistsException(NoSuchItemInCartExists e) {
		HttpStatus notFound = HttpStatus.NOT_FOUND;
		ProductException productException = new ProductException(e.getMessage(), e, notFound,
				ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
		return new ResponseEntity<>(productException, notFound);
	}

	@ExceptionHandler(value = { ProductAlreadyExists.class })
	public ResponseEntity<Object> handleProductAlreadyExistsException(ProductAlreadyExists e) {
		HttpStatus notAcceptable = HttpStatus.NOT_ACCEPTABLE;
		ProductException productException = new ProductException(e.getMessage(), e, notAcceptable,
				ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
		return new ResponseEntity<>(productException, notAcceptable);
	}

}
