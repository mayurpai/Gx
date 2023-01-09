package com.java.datatypes.conversions;

public class Implicit {

	public static void main(String[] args) {
		int intPrimitiveDataType = 100;
		System.out.println(intPrimitiveDataType);

		long longPrimitiveDataType = intPrimitiveDataType;
		System.out.println(longPrimitiveDataType);

		float floatPrimitiveDataType = longPrimitiveDataType;
		System.out.println(floatPrimitiveDataType);
	}
}
