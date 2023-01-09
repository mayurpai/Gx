package com.java.functionalinterfaces;

/*
 * An Interface That Contains Exactly One Abstract Method
 * And Any Number Of Default And Static Methods 
 * Is Called Functional Interface. */

@FunctionalInterface
interface FunctionInterfaceDemo {

	public void abstractMethod();

	public default void defaultMethod() {
		System.out.println("Default Method");
	}

	public static void staticMethod() {
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		FunctionInterfaceDemo functionalInterface = new FunctionInterfaceDemo() {

			@Override
			public void abstractMethod() {
				System.out.println("Abstract Method");

			}
		};

	}

}
