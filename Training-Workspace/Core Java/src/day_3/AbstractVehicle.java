package day_3;

abstract class Vehicle {
	int price = 1000;
	{
		System.out.println("Instance Block");
	}

	static {
		System.out.println("Vehicle Static");
	}

	public Vehicle() {
		System.out.println("Vehicle Default Constructor");
	}

	public abstract void start();

	public abstract void stop();

	public void hello() {
		System.out.println("Hello");
	}

}

// Is-A Relationship
class Car extends Vehicle {

	public Car() {
		System.out.println("Car Default Constructor");
	}

	String acType;
	int price = 2000;

	public void onAC() {
		System.out.println("AC On");
	}

	public void offAC() {
		System.out.println("AC Off");
	}

	public void carDetails() {
		int price = 3000;
		System.out.println("Price Of Vehicle In Car Details: " + price);
		System.out.println("Price Of Vehicle In Class: " + this.price);
		System.out.println("Price Of Vehicle In Super Class: " + super.price);
	}

	@Override
	public void start() {
		System.out.println("Car Start");
	}

	@Override
	public void stop() {
		System.out.println("Car Stop");
	}

}

public class AbstractVehicle {

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.stop();
		c.onAC();
		c.offAC();
		c.carDetails();
		c.hello();
	}

}
