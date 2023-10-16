package com.kh.example.practice3.model.vo;

public class Circle {
	//1.필드(멤버변수)
	double Pi = 3.14; //원주율
	int radius = 2; //반지름
	
	//2.생성자
	public Circle(double Pi, int radius) {//원의 정보를 초기화
		/*
		기본 생성자로 놔두고 아무런 초기화를 진행하지 않는다
		this.Pi = 3.14;
		this.radius = radius; //1로 초기화........해야될까..............
		*/
		
	}
	
	//3.원 정보 출력 메소드
	
	public void incrementRadius() {
		radius++ ;
		System.out.println("왠지 모르겠지만.. 암튼 반지름 증가.. : " + radius);
	}
	
	public void getAreaOfCircle() {
		System.out.println("면적 : " + (Pi*radius*radius));
	}
	
	public void getSizeOfCircle() {
		System.out.println("둘레 : " + (2*Pi*radius));
	}

}
