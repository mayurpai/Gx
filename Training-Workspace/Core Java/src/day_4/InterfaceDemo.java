package day_4;

// By Default Abstract, Static And Final Methods And Variables
// Cannot Have Non-Abstract Methods
// Static Methods And Default Methods Are Possible
// Java Doesn't Support Multiple Inheritance Through Classes
// Multiple Inheritance Is Possible By Using Interfaces

abstract class Vehicle {
	// abstract class Vehicle extends Object {
	// By Default It Extends Object

	int price = 1000;

	public abstract void start();

	public abstract void stop();

}

interface MusicPlayer {
	void play();

	int noOfSongs = 19;
}

interface Radio {
	void scan();

	int frequency = 93;
}

class Bike extends Vehicle implements Radio {
	@Override
	public void scan() {
		System.out.println("Bike Scanning Radio");

	}

	@Override
	public void start() {
		System.out.println("Bike Started");

	}

	@Override
	public void stop() {
		System.out.println("Bike Stopped");

	}
}

// Is-A Relationship
class Car extends Vehicle implements MusicPlayer, Radio {
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

	@Override
	public void play() {
		System.out.println(noOfSongs + 1);
		System.out.println("Car Playing Song");

	}

	@Override
	public void scan() {
		System.out.println(frequency);
		System.out.println("Radio Scan");

	}

}

public class InterfaceDemo {

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.stop();
		c.onAC();
		c.offAC();
		c.carDetails();
		c.scan();
		c.play();
		Bike b = new Bike();
		b.scan();
		b.start();
		b.stop();

		// Another Way
		Vehicle v = new Car();
		v.start();
		v.stop();
		v = new Bike();
		v.start();
		v.stop();

		// v --> Car
		// As We Do v = new Bike();
		// v -/-> Car, v --> Bike
		// Garbage Collection Frees Up The Memory Making (Car) Eligible
		// Another Way Is Used As A Best Practice

		c = null; // Dereferencing The Object For Helping GC
	}

}
