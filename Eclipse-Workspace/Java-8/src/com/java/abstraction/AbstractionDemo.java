package com.java.abstraction;

public class AbstractionDemo {

	public static void main(String[] args) {
		GraphicObject circle = new Circle();
		circle.draw();
		circle.resize();
		circle.moveTo(3, 4);
	}

}
