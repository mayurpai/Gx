package com.java.exceptions;

public class SimpleExceptionDemo {

	public void divideByZero() throws DivideByZeroException {
		int dividebyZeroData = 100 / 0;
	}

	public static void main(String[] args) throws DivideByZeroException {
		SimpleExceptionDemo simpleExceptionDemo = new SimpleExceptionDemo();
		try {
			simpleExceptionDemo.divideByZero();
		} catch (DivideByZeroException e) {
			System.out.println(e.getMessage());
			throw new DivideByZeroException();
		}

		String nullString = null;
		System.out.println(nullString.charAt(0));

	}

}
