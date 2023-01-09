package com.java.lambda;

/*
 * Lambda Expression Is An Anonymous Function
 * That Has No Name And Does Not Belong To Any Class Or Object.
 * It Is Mainly Used To Implement Functional Interfaces.
 * () -> {}
 * Lambda Input Parameters - Arrow Denoting Lambda - Lambda Body */

interface Shape {
	void draw();
}

//class Rectangle implements Shape {
//	@Override
//	public void draw() {
//		System.out.println("Rectangle Draw Method");
//	}
//}
//
//class Circle implements Shape {
//	@Override
//	public void draw() {
//		System.out.println("Circle Draw Method");
//	}
//}
//
//class Square implements Shape {
//	@Override
//	public void draw() {
//		System.out.println("Square Draw Method");
//	}
//}

public class LambdaExample {

	private static void display(Shape shape) {
		shape.draw();
	}

	public static void main(String[] args) {
		Shape rectangle = () -> System.out.println("Rectangle Draw Method");
		/* Passing Lambda Behaviour To A Function */
		display(() -> System.out.println("Rectangle Draw Method"));
//		rectangle.draw();

		Shape circle = () -> System.out.println("Circle Draw Method");
		display(() -> System.out.println("Circle Draw Method"));
//		circle.draw();

		Shape square = () -> System.out.println("Square Draw Method");
		display(() -> System.out.println("Sqaure Draw Method"));
//		square.draw();

		/* Passing Lambda Expressions To Functions */
		display(rectangle);
		display(circle);
		display(square);

	}
}
