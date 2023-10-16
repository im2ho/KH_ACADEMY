package com.kh.classCircle;

public class Circle {
	
	//1. 멤버변수 (필드) > 변수에도 외부에서 건들지 못하게 private처리
	//private static final double Pi = 3.14;으로해도 출력 가능 (메모리 저장 위치만 달라짐)
	private final double Pi = 3.14; //Pi = 상수 (절대 변하지 않는 값)
	private int radius = 1; //변수
	
	//2. 생성사
	public Circle() {
		//기본생성자
	}
	
	//3. 메소드
	//반지름에 대해 출력
	public void inRadius() {
		//반지름 증가: 증가시킬 양을 지정할 수 있다
		radius ++ ;
	}
	
	//원의 넓이를 계산하고 출력하는 메소드
	public void AreaCircle() {
		double area = Pi * radius * radius;
		System.out.println("원의 넓이 : " + area);
	}
	
	//
	public void SizeOfCircle() {
		System.out.println("원의 크기(반지름) : " + radius);
	}

}