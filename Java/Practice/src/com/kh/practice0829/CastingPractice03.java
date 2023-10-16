package com.kh.practice0829;

public class CastingPractice03 {
	
	// method와 main의 차이?
	public void method() {
	/*선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산과 형변환을 이용하여 
	  주석에 적힌 값과 같은 값이 나오도록 코드를 작성하세요. */
	
		int iNum1 = 10;
		int iNum2 = 4;

		float fNum = 3.0f;

		double dNum = 2.5;

		char ch = 'A';
		
		System.out.println((float)dNum); //2.5출력 목적 (float 형변환 이유: 쓰레기값 출력 방지)
		
		System.out.println((int)fNum); //float fNum = 3.0f; -> 3
		System.out.println(iNum1 / (int)fNum); // 3 정수와 실수를 나눠서 3인 정수로 출력
		System.out.println(iNum1 / fNum); //정수와 실수를 나눠서 3.333333인 float을 출력
		System.out.println((double)iNum1 / fNum); //정수와 실수를 나눠서 3.333333333333333335인 double 출력
		
		System.out.println(ch); //'A' char 출력 문제
		System.out.println((int)ch); // 65 int로 변경해서 출력
		System.out.println((int)ch + iNum1); // int로 ch로 변경 후 더하기
		System.out.println((char)((int)ch + iNum1)); // 위에 코드 그대로 char로 형변환
	}

}
