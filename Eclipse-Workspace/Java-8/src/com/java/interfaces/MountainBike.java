package com.java.interfaces;

public class MountainBike extends TwoWheeler implements Bicycle, Vehicle {

	public int speed;

	public MountainBike() {
	}

	public MountainBike(int speed) {
		this.speed = speed;
	}

	public int getspeed() {
		return speed;
	}

	public void setspeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void applyBrake(int decrement) {
		speed -= decrement;
	}

	@Override
	public void speedUp(int increment) {
		speed += increment;
	}

	@Override
	public void canDrive() {
		System.out.println("Mountain Bike Can Be Driven");

	}

}
