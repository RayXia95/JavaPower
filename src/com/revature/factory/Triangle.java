package com.revature.factory;

public class Triangle implements Shape {

	private final int sides;

	public Triangle() {
		this.sides = 3;
	}

	@Override
	public int getSides() {
		return sides;
	}

	// Concrete class
	@Override
	public void draw() {
		System.out.println("A triangle is being drawn");

	}

}
