package com.java.abstraction;

public abstract class GraphicObject {
	int X, Y;

	public GraphicObject() {
		System.out.println("Graphic Object Constructor Called");
	}

	void moveTo(int newX, int newY) {
		System.out.println("[X:" + newX + ", Y:" + newY + "]");
	}

	abstract void draw();

	abstract void resize();
}
