package day_7;

interface Radio {
	void scan();
}

abstract class Animals {

	public Animals() {
		System.out.println("Animals Constructor Called");
	}

	public abstract void eat();

	public void sleep() {
		System.out.println("Animals Sleep");
	}

}

public class AnonymousClassDemo {

	public AnonymousClassDemo() {

	}

	public static void main(String[] args) {
		// You Cannot Have Constructors In Anonymous Classes

		Animals animal = new Animals() {
			// Anonymous Class
			@Override
			public void eat() {
				System.out.println("Animals Eat");

			}

		};
		animal.eat();
		animal.sleep();

		Radio radio = new Radio() {
			// Anonymous Class
			@Override
			public void scan() {
				System.out.println("Radio Scan");
			}
		};
		radio.scan();

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Run Called: " + Thread.currentThread().getName());

			}
		};
		Thread t1 = new Thread(runnable);
		t1.start();

		System.out.println("Main Called: " + Thread.currentThread().getName());
	}

	private static void Animals() {
		// TODO Auto-generated method stub

	}

}
