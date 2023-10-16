package com.kh.abstractSample;

public class Rectangle extends RectangleShape {
	private double width;
	private double heigth;
	
	//생성자
	public Rectangle(String color, double width, double heigth) {
		super(color); //RectangleShape클래스에서 color 상속받아오기
		this.width = width;
		this.heigth = heigth;
	}
	
	@Override //추상메서드 구현 안해주면 클래스 오류남
	//님 왜 claculateArea 그냥 놀게 냅둠? 이럴거면 나 왜 씀?
	public double calculateArea() {
		return width*heigth;
	} //마저 구현 완료해줬다..
	
}
