package com.kh.inheritance.calculator;

//나눈 다음 나머지를 구할 수 있는 기능이 구현된 계산기
public class CalculatorForMod extends Calculator {
	
	int num1, num2;
	
	public int mod(int num1, int num2) { // mod:나머지를 반환
		return num1 % num2;
	}
	
}
