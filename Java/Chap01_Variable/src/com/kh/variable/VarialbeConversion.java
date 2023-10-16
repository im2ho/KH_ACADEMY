package com.kh.variable;

public class VarialbeConversion {
	public static void main(String[] args) {
		
		/*
		
		//1. 자동형변환(암시적형변환, 묵시적형변환)
		
		int intNum = 100;
		System.out.println(intNum); //숫자 100을 의미
		
		long longNum = intNum; //int를 long으로 자동 형변환
		System.out.println(longNum);
		
		float floatNum = 3.14f;
		double doubleNum = floatNum; //float을 double로 자동 형변환
		
		System.out.println();
		
		*/
		
		/*
		
		// int > long 변경하는 형변환 2가지 만들고 출력하기
		//1)
		int num1 = 100;
		System.out.print("num1 : ");
		System.out.println(num1);
		
		long num2 = num1;
		System.out.println(num2);
		//2)
		int intNum = -100;
		System.out.print("intNum : ");
		System.out.println(intNum);
		
		long longNum = intNum;
		System.out.println(longNum);
		
		// short > int 변경하는 형변환 1가지 만들고 출력하기
		
		short num3 = 50;
		int num4 = num3;
		System.out.println(num4);
		
		// float > double 변경하는 형변환 1가지 만들고 출력하기
		
		float num5 = 1.96f;
		System.out.print("num5 : ");
		System.out.println(num5);
		double num6 = num5;
		System.out.println(num6);
		
		//2.명시적 형변환(강제 형변환)
		// long > int
		long largeLong = 123456789012345L;
		System.out.print("largeLong : ");
		System.out.println(largeLong);
		
		//int largeInt = largeLong; >단순변환 불가능 (mismatch) > 형변환 방식 변경 or 데이터타입 통일...
		int largeInt = (int) largeLong;
		System.out.println(largeInt); //값이 -2045911175로 깨져서 나온다..! <데이터 손실
		//long을 int로 강제 형변환 할 경우 값이 범위 안에 있지 않으면 일부 데이터는 손실된다 덜덜
		//int가 넣을 수 있는 값 ex)12345 으로 적용하면 정상 출력 가능 
		
		double largeDouble1 = 12345.6789;
		int intPart = (int) largeDouble1;
		System.out.println(intPart); //실수를 int로 강제 형변환 할 때 > 정수 부분만 유지된다
		
		*/
		
		//문자와 숫자간의 형변환 2개 출력
		// 1) 문자는 char charBalue = 'Z'; >int로 변경
		// 1)-1
		char charBalue = 'Z';
		int num7 = charBalue;
		System.out.println(num7);
		
		// 1)-2
		char charValue = 'A';
		int num12 = charValue;
		System.out.println(num12);
		
		// 2) double -> int로 형변환 출력 1개
		
		double num8 = 8.16;
		int num9 = (int) num8;
		System.out.println(num9);
		
		// 3) int -> short로 형변환 출력 1개
		
		int num10 = 777;
		short num11 = (short) num10;
		System.out.println(num11);
	}
}
