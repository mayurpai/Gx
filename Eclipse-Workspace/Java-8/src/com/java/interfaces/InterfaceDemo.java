package com.java.interfaces;

public class InterfaceDemo {

	public static void main(String[] args) {
		MountainBike mountainBike = new MountainBike();
		mountainBike.setspeed(10);
		System.out.println(mountainBike.getspeed());
		mountainBike.applyBrake(2);
		System.out.println(mountainBike.getspeed());
		mountainBike.speedUp(13);
		System.out.println(mountainBike.getspeed());
		mountainBike.canDrive();
		mountainBike.canRotateTwoWheeler();
	}

}
