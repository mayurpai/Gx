package com.java.inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
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
