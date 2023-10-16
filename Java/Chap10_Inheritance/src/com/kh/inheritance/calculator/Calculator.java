package com.kh.inheritance.calculator;

import java.util.Scanner;

public class Calculator {
	
	//계산기를 만들어보자~
	
	int num1, num2; //객체 변수 아님
	
	
	//1. 더하기
	
	public int add() { //파라미터(매개변수) : 숫자 2개
		return num1 + num2; //반환값이 있으므로 함수에 변수형 입력 필수
	}
	
	//2. 빼기
	
	public int substract() { 
		return num1 - num2; 
	}
	
	//3. 곱하기
	
	public int multiply() { 
		return num1 * num2; 
	}
	
	//4. 나누기
	
	public int divide() {
		if(num2 == 0) {
			System.out.println("나누는 값이 0이 되면 안됩니다");
			return 0;
		} else {
			return num1 / num2;
		}
	}
	//몫 이외에 나머지도 보고싶음..

}