package com.java.functionalinterfaces;

import java.util.function.Consumer;

public class ConsumerImpl implements Consumer<String> {

	@Override
	public void accept(String input) {
		System.out.println(input);
	}

	public static void main(String[] args) {
		Consumer<String> consumer = (String input) -> System.out.println(input);
		consumer.accept("Mayur Pai B H");
	}

}
