package com.kh.operator;

public class Arithmetic {

	public static void main(String[] args) {
		// 1. Arithmetic: 산술연산자 ( +, - , *, 나누기 몫(/), 나누기 나머지(%))
		// 연산 방법과 우선 순위가 일반 수학과 동일
		
		int num1 = 5;
		int num2 = 2;
		
		System.out.println("더하기+ : " + (num1 + num2)); //괄호 없이 입력하면 52로 출력됨..
		System.out.println("빼기- : " + (num1 - num2)); // (): 최우선 연산자
		System.out.println("곱하기* : " + (num1 * num2));
		System.out.println("나누기 몫/ : " + (num1 / num2));
		System.out.println("나누기 나머지% : " + (num1 % num2));

	}

}
