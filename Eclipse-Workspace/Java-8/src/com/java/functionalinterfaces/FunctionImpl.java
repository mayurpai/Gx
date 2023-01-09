package com.java.functionalinterfaces;

import java.util.function.Function;

public class FunctionImpl implements Function<String, Integer> {
	@Override
	public Integer apply(String t) {
		return t.length();
	}

	public static void main(String[] args) {

		Function<String, Integer> function = new FunctionImpl();
		System.out.println(function.apply("Mayur"));

		Function<String, Integer> lambdaFunction = (String s) -> s.length();
		System.out.println(lambdaFunction.apply("Mayur Pai"));

	}

}
