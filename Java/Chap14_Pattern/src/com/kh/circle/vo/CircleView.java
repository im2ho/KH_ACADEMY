package com.kh.circle.vo;

import java.util.Scanner;

public class CircleView {//원의 정보를 화면에 출력
	
	//클라이언트가 넣을 값
	public double getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하세요 : ");
		return sc.nextDouble();
	}
	
	/*
	//계산된 결과
	public void displayInfo(double circleRadius, double circleArea) {
		System.out.println("원의 정보");
		System.out.println("반지름 : " + circleRadius);
		System.out.println("원의 넓이 :" + circleArea);
	}
	*/
}