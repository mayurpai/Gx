package com.java.datatypes.conversions;

public class Explicit {

	public static void main(String[] args) {
		double doublePrimitiveDataType = 100.123d;
		System.out.println(doublePrimitiveDataType);

		float floatPrimitiveDataType = (float) doublePrimitiveDataType;
		System.out.println(floatPrimitiveDataType);

		long longPrimitiveDataType = (long) floatPrimitiveDataType;
		System.out.println(longPrimitiveDataType);

		int intPrimitiveDataType = (int) longPrimitiveDataType;
		System.out.println(intPrimitiveDataType);

	}
}
