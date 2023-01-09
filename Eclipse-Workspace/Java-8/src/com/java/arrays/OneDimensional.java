package com.java.arrays;

import java.util.Arrays;

public class OneDimensional {

	public static void main(String[] args) {
		int naturalNumbers[];
		naturalNumbers = new int[3];
		naturalNumbers[0] = 1;
		naturalNumbers[1] = 2;
		naturalNumbers[2] = 3;

		System.out.println(Arrays.toString(naturalNumbers));
		System.out.println("Element At Index 0: " + naturalNumbers[0]);
		System.out.println("Element At Index 1: " + naturalNumbers[1]);
		System.out.println("Element At Index 2: " + naturalNumbers[2]);

		for (int i : naturalNumbers) {
			System.out.println(i);
		}

	}

}
