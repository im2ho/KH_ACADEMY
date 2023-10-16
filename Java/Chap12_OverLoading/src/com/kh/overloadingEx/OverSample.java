package com.kh.overloadingEx;

/*
Java 파일을 만드는데
파일명: OverSample.java 만들고
오버로딩 5개 만들고 메서드 5개 출력하기
*/

public class OverSample {
	
	// 두 개 정수 곱을 반환하는 생성자
	public int Mul(int a, int b) {
		return a * b;
	}
	
	// 세 개 정수 곱
	public int Mul(int c, int d, int e) {
		return c * d * e;
	}
	
	// 두 개 실수 곱
	public double Mul(double f, double g) {
		return f * g;
	}
	
	// 세 개 실수 곱
	public double Mul(double h, double i, double j) {
		return h * i * j;
	}
	
	// 한 개 실수 제곱
	public double Mul(double k) {
		return k*k ;
	}

	public static void main(String[] args) {
		
		//객체이자 인스턴스 생성.....
		OverSample obj = new OverSample();
		
		//메서드 호출
		System.out.println("두 정수의 곱 : " + obj.Mul(3,4));
		System.out.println("세 정수의 곱 : " + obj.Mul(3,4,5));
		System.out.println("두 실수의 곱 : " + obj.Mul(1.5,3.5));
		System.out.println("세 실수의 곱 : " + obj.Mul(1.5, 3.5, 5.5));
		System.out.println("한 실수의 제곱 : " + obj.Mul(5.5));

	}

}