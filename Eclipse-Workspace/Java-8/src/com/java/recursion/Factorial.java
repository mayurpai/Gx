package com.java.recursion;

public class Factorial {

	int facorialComputer(int n) {
		if (n == 1)
			return n;
		else
			return (n * facorialComputer(n - 1));
	}

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		System.out.println(factorial.facorialComputer(5));

	}

}
