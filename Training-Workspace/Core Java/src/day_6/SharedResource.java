package day_6;

class TwoString {
	// print Is A Shared Resource Here
	static synchronized void print(String stringOne, String stringTwo) {
//	static void print(String stringOne, String stringTwo) {

		// Synchronized Is Used For Thread Safety And It Allows The Thread To Fully
		// Finish It's Execution On Hold Of Shared Resource Without Any Interruptions
		System.out.println(stringOne);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println(stringTwo);
	}
}

class PrintStringsThread implements Runnable {
	Thread thread;
	String stringOne, stringTwo;

	PrintStringsThread(String stringOne, String stringTwo) {
		this.stringOne = stringOne;
		this.stringTwo = stringTwo;
		thread = new Thread(this);
		thread.start();
	}

	public void run() {
		TwoString.print(stringOne, stringTwo);
	}
}

public class SharedResource {

	public static void main(String[] args) {
		new PrintStringsThread("Mayur", "Pai");
		new PrintStringsThread("Reshma", "Pai");
	}

}
