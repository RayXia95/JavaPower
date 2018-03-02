package com.revature.factory;

public class Circle implements Shape {

	private final int sides;

	public Circle() {
		this.sides = 0;
	}

	@Override
	public int getSides() {
		return sides;
	}

	// Concrete Class
	@Override
	public void draw() {
		System.out.println("A circle is being drawn");

	}

}
