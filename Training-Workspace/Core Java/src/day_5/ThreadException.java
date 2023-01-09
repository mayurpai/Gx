package day_5;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThreadException {

	int numberOne, numberTwo, result;
	String name;

	// Checked Exceptions / Compile Time Exceptions (Always Requires A Try Catch)
	// OR
	// Checked Exceptions / Compile Time Exceptions (Throw The Exception To Caller
	// Or Main Method)
	// cont... Again The Caller Or Main Will Have To Surround With Try-Catch Or
	// Throw It To JVM
	// Throws Is Used When You Have Many Methods To Be Taken Care At 1 Method
	// Throw Is Used To Raise The Exceptions
	// Throws Is Used To Delegate The Exceptions

	public void display() throws InterruptedException {
		System.out.println("Hi");
		Thread.sleep(1000);
		System.out.println("Bye");
	}

	public void displayTwo() throws InterruptedException {
		System.out.println("Hi");
		Thread.sleep(1000);
		System.out.println("Bye");
	}

	public static void main(String[] args) {
		System.out.println("Main Called");
		ThreadException te = new ThreadException();
		try {
			te.display();
			te.displayTwo();
			FileReader fr = new FileReader("random.txt");
		} catch (InterruptedException | FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Thanks For Using The Program!");

	}

}
