package com.java.functionalinterfaces;

public class ThreadDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread Running");

	}

	public static void main(String args[]) {
		Thread threadDemo = new Thread(new ThreadDemo());
		threadDemo.start();
		
		Runnable runnable = () -> System.out.println("Thread Running");
		Thread threadLambda = new Thread(runnable);
		threadLambda.start();
	}

}
