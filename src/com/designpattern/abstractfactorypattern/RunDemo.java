package com.designpattern.abstractfactorypattern;

public class RunDemo {

	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		Shape shape = sf.getShape("CIRCLE");
		shape.draw();
	}

}
