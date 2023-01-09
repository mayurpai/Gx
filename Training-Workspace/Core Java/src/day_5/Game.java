package day_5;

public class Game extends Thread {

	Thread thread;

	public Game() {
		thread = new Thread(this);
		System.out.println("1. Before Child Thread Runs");
		thread.start(); // Main Thread Starts The Child Thread And It Never Goes To Run Method Immediately
		System.out.println("2. ? Child Thread Started: " + Thread.currentThread().getName()); // There Is A Chance That
																								// It Can Go To The Run
																								// Method

	}

//	@Override
//	public void run() {
//		System.out.println("4 ?. Run Called: " + Thread.currentThread().getName()); 
//		try {
//			for (int i = 1; i <= 5; i++) {
//				System.out.println("Child Thread " + i + " Called");
//				Thread.sleep(1000);
//			}
//		} catch (InterruptedException e) {
//			System.out.println("Thread Interrupted");
//		}
//		System.out.println("Child Thread Exited!");
//	}

	@Override
	public void run() {
		System.out.println("4 ?. Run Called: " + Thread.currentThread().getName());
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child Thread " + i + " Called");
		}
	}

	public static void main(String[] args) {
		Game g = new Game();
		System.out.println("3 ?. Main Called: " + Thread.currentThread().getName()); // Main Thread Is Created By JVM
																						// And Has
		// Higher Priority
	}

}
