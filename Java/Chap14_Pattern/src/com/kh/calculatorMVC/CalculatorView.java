package com.kh.calculatorMVC;

import java.util.Scanner;

public class CalculatorView {
	public int getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		return sc.nextInt();
	}
	
	public void displayResult(int result) {
		System.out.println("결과 : " + result);
	}
}
