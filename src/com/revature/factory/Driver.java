package com.revature.factory;

public class Driver {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape s1 = shapeFactory.getShape(0);

		s1.draw();

		Shape s2 = shapeFactory.getShape(3);

		s2.draw();

		Shape s3 = shapeFactory.getShape(4);

		s3.draw();

	}
}
