package com.java.arrays;

public class TwoDimensional {

	public static void main(String[] args) {
		int twoDimensionalArray[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < twoDimensionalArray.length; i++) {
			for (int j = 0; j < twoDimensionalArray[0].length; j++) {
				System.out.print(twoDimensionalArray[i][j] + " ");
			}
			System.out.println();
		}

	}

}
