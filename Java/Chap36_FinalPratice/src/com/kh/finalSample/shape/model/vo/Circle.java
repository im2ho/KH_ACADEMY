package com.kh.finalSample.shape.model.vo;

public class Circle {
	
	//�Ű����� ���ϳ�
	public static final double PI = 3.14;
	public double radius;
	
	//������
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//GetterSetter
	public double getRadius() {
		return radius;
	}
	
	public static double getPi() {
		return PI;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println(radius);
	}
}
