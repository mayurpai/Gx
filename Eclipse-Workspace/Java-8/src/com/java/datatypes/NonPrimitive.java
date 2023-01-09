package com.java.datatypes;

import java.util.Arrays;

public class NonPrimitive {

	public static void main(String[] args) {
		String firstName = "Mayur";
		String lastName = new String("Pai");

		System.out.println(firstName);
		System.out.println(lastName);

		int naturalNumbers[];
		naturalNumbers = new int[3];
		naturalNumbers[0] = 1;
		naturalNumbers[1] = 2;
		naturalNumbers[2] = 3;

		System.out.println(Arrays.toString(naturalNumbers));
		System.out.println(naturalNumbers[0]);
		System.out.println(naturalNumbers[1]);
		System.out.println(naturalNumbers[2]);

	}
}
