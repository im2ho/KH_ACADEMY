package com.kh.abstractSample;
//추상클래스 정의
abstract class Shape {
	//일반 필드
	private String color;
	
	//추상 메서드 (하위 클래스에서 구현해야 함)
	abstract double calculateArea();
	
	//생성자
	public Shape(String color) {
		this.color = color;
	}
	
	//일반 메서드 (Getter, Setter)
	public void setColor(String color) { //메서드: 리턴이든 보이드든 둘 중 하나 존재 필수
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

}