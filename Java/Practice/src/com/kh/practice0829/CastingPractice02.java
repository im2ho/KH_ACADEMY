package com.kh.practice0829;

import java.util.Scanner;

public class CastingPractice02 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	
	//Practice02: 실수형으로 점수 입력받고, 총점 및 평균은 정수형으로 출력하기
		
	double kor, math, eng;
	
	System.out.print("국어 :");
	kor = sc.nextDouble();
	
	System.out.print("수학 :");
	math = sc.nextDouble();

	System.out.print("영어 :");
	eng = sc.nextDouble();
	
	int sum = (int)(kor + math + eng) ; //sum을 int로 형변환
	int avg = (int)(sum/3); //avg을 int로 형변환
	
	System.out.println("총점 : " + sum);
	System.out.println("평균 : " + avg);
	

		
		
	/*선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산과 형변환을 이용하여 
	  주석에 적힌 값과 같은 값이 나오도록 코드를 작성하세요. */
	
	
		

	
	}
}
