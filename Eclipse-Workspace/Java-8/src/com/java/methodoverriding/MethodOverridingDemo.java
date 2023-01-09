package com.java.methodoverriding;

public class MethodOverridingDemo {

	public static void main(String[] args) {
		Bicycle bicycle = new Bicycle(4, 45);
		bicycle.applyBreak(5);
		System.out.println(bicycle.getSpeed());
		bicycle.speedUp(2);
		System.out.println(bicycle.getSpeed());
		MountainBike mountainBike = new MountainBike(20, 10, 1);
		System.out.println(mountainBike.getGear());
		System.out.println(mountainBike.getSpeed());
		System.out.println(mountainBike.getSeatHeight());
		mountainBike.applyBreak(4);
		System.out.println(mountainBike.getSpeed());
		mountainBike.speedUp(12);
		System.out.println(mountainBike.getSpeed());

	}

}
