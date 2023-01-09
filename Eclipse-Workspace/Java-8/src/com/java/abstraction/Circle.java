package com.java.abstraction;

public class Circle extends GraphicObject {

	public Circle() {
		System.out.println("Circle Constructor Called");
	}

	@Override
	void draw() {
		System.out.println("Drawing A Circle");

	}

	@Override
	void resize() {
		System.out.println("Resizing A Circle");

	}

}
