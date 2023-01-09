package day_5;

public class GameTwo implements Runnable {
	// implements Runnable Is Used When You Already Have An Extended Class And Want To Extend Thread As Well
	// Since Multiple Inheritance Isn't Possible
	Thread thread;

	public GameTwo() {
		thread = new Thread(this);
		System.out.println("1. Before Child Thread Runs");
		thread.start(); // Main Thread Starts The Child Thread
		System.out.println("2. ? Child Thread Started: " + Thread.currentThread().getName()); // There Is A Chance That
																								// It Can Go To The Run
																								// Method

	}

	@Override
	public void run() {
		System.out.println("4 ?. Run Called: " + Thread.currentThread().getName());
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child Thread " + i + " Called");
		}
	}

	public static void main(String[] args) {
		GameTwo g = new GameTwo();
		System.out.println("3 ?. Main Called: " + Thread.currentThread().getName()); // Main Thread Is Created By JVM
																						// And Has
		// Higher Priority
	}

}
