package com.kh.circle.mo;

public class CircleModel { //원의 정보를 어떻게 표현할 것인가..
	
	//private double pi = 3.14; //원주율
	private double r; //원의 정보를 반지름을 통해 표현하겠다~
	
	public CircleModel() { //default생성자라서 내용 쓰지 않아도 ok >매개변수도 팰요 x
		//this.r  = r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	public double calculateArea() {
		return (3.14*r*r);
	}

}
