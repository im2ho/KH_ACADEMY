package com.kh.example.practice3.run;

import com.kh.example.practice3.model.vo.Circle;

public class CircleRun {

	public static void main(String[] args) {
		// 원 객체 생성
		
		Circle circle1 = new Circle(3.14,2);
		
		circle1.incrementRadius();
		circle1.getAreaOfCircle(); //결과값이 너무 그런데 이거 소수점 몇 자리까지 나오는거야...
		circle1.getSizeOfCircle();
		

	}

}
