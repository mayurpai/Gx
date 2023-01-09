package com.java.methodoverloading;

public class MethodOverloadingDemo {

	public int multiply(int x, int y) {
		return x * y;
	}

	public int multiply(int x, int y, int z) {
		return x * y * z;
	}

	public double multiply(double x, double y) {
		return x * y;
	}

	public double multiply(double x, double y, double z) {
		return x * y * z;
	}

	public static void main(String[] args) {
		MethodOverloadingDemo demo = new MethodOverloadingDemo();
		System.out.println(demo.multiply(3, 4));
		System.out.println(demo.multiply(3.34, 4.43534));
		System.out.println(demo.multiply(3, 4, 8));
		System.out.println(demo.multiply(3.322, 4.2323, 5.434));
	}

}
