package com.java.lambda;

interface Addable {
	int addition(int numberOne, int numberTwo);
}

public class LambdaParameters {

	public static void main(String args[]) {
		Addable addable = (numberOne, numberTwo) -> numberOne + numberTwo;
		System.out.println(addable.addition(3, 4));
	}

}
