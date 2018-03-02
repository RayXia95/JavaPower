package com.revature.factory;

public class Rectangle implements Shape {

	private final int sides;

	public Rectangle() {
		this.sides = 4;
	}

	@Override
	public int getSides() {
		return sides;
	}

	// Concrete class
	@Override
	public void draw() {
		System.out.println("A Rectangle is being drawn");

	}

}
