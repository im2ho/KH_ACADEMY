package com.kh.abstractSample;

abstract class RectangleShape {
	private String color;
	
	//추상 메서드
	abstract double calculateArea();
	
	public RectangleShape(String color) {
		this.color = color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
}
