package day_2;

class Vehicle {
	int price = 1000;

	public void start() {
		System.out.println("Vehicle Start");
	}

	public void stop() {
		System.out.println("Vehicle Stop");
	}

}

// Is-A Relationship
class Car extends Vehicle {
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
		super.start();
		System.out.println("Car Start");
	}

	@Override
	public void stop() {
		super.stop();
		System.out.println("Car Stop");
	}

}

public class Client {

	public static void main(String[] args) {
		Car c = new Car();
//		Vehicle v = new Vehicle();
		c.start();
		c.stop();
//		v.stop();
		c.onAC();
		c.offAC();
		c.carDetails();
	}

}
