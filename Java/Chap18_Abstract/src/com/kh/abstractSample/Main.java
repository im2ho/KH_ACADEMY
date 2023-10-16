package com.kh.abstractSample;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle("Blue", 5.0);
		System.out.println("Circle Area : " + circle.calculateArea());
		System.out.println("Circle color : " + circle.getColor());
		
		Rectangle rectangle = new Rectangle("Yellow", 4.0, 6.0);
		System.out.println("Rectangle Area : " + rectangle.calculateArea());
		System.out.println("Rectangle color : " + rectangle.getColor());
	}

}
