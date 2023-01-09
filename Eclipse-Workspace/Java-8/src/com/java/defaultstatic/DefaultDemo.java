package com.java.defaultstatic;

interface Vehicle {
	String getBrand();

	String speedUp();

	String slowDown();

	default String turnAlarmOn() {
		return "Turning System.out.println(vehicle Alarm On";
	}

	default String turnAlarmOff() {
		return "Turning System.out.println(vehicle Alarm Off";
	}

	static int getCost() {
		return 799999;
	}

}

/* Don't Need To Override The Default And Static Methods */
class Car implements Vehicle {

	@Override
	public String getBrand() {
		return "BMW";
	}

	@Override
	public String speedUp() {
		return "Car Speeding";
	}

	@Override
	public String slowDown() {
		return "Car Slowing Down";
	}

}

public class DefaultDemo {

	public static void main(String[] args) {
		Car vehicle = new Car();
		System.out.println(vehicle.getBrand());
		System.out.println(vehicle.slowDown());
		System.out.println(vehicle.speedUp());
		System.out.println(vehicle.turnAlarmOff());
		System.out.println(vehicle.turnAlarmOn());
		System.out.println(Vehicle.getCost());

	}

}
