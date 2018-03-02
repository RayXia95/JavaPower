package com.revature.factory;

public class ShapeFactory {

	public Shape getShape(int sides) {
		switch (sides) {
			case 0:
				return new Circle();
			case 3:
				return new Triangle();
			case 4:
				return new Rectangle();
			default:
				return null;
		}
	}
}
