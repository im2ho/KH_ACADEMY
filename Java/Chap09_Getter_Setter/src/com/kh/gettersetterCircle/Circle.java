package com.kh.gettersetterCircle;

public class Circle {
	
	//1. 멤버변수(필드)
	private final double Pi = 3.14; //Pi = 상수 (절대 변하지 않는 값)
			//final : 변수에 붙을 경우, 이 변수는 수정될 수 없음을 뜻함
	private int radius = 1; //변수
	
	//Getter
	public double getPi() {
		return Pi;
	}
	
	public int getRadius() {
		return radius;
	}
	
	//Setter (PI값은 상수로 설정해서 Setter사용 X)
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//메서드
	
	//반지름에 대해 출력
	public void incrementRadius() {
		//반지름 증가: 증가시킬 양을 지정할 수 있다
		radius ++ ;
	}
	
	//반지름 출력 메서드
	public void getSizeOfCircle() {
		System.out.println("원의 크기(반지름) : " + radius);
	}

	//원의 넓이를 계산하고 출력하는 메서드
	public void getAreaCircle() {
		double area = Pi * radius * radius;
		System.out.println("원의 넓이 : " + area);
	}
		

	
	
	

}
