package com.kh.ifsample;

import java.util.Scanner;

public class IfElseif_Sample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// if-else if-else
		/*
		 여러 개의 조건을 연속적으로 평가하고
		 그 중 첫 번째 참인 조건에 해당하는 코드 블록을 실행하는 구조
		 
		 만약 if나 else if의 조건도 참이 아니라면 마지막 else 블록 실행
		 
		 if (조건1) {
		  //조건1이 참일 때 실행되는 코드
		 } else if (조건) {
		 } else {
		  //위의 모든 조건이 거짓일 때 실행되는 코드
		 }
		 
		 */
		
		/*
		 * 
		// sample1
		int age;
		age = 41;
		
		if(age>=20 && age<=30) {
			System.out.println("해외여행을 가자!");
		} else if(age<20) {
			System.out.println("집에나 있자.");
		} else {
			System.out.println("세계여행을 떠나자!");
		}
		
		// sample2
		double score = 79;
		
		if(score>90) {
			System.out.print("A");
		} else if(score==90) {
			System.out.print("B+");
		} else {
			System.out.println("B");
		}
		
		// sample3
		int hour = 15;
		
		if(hour <12) {
			System.out.println("힘세고 강한 아침!");
		} else if(hour < 18){
			System.out.println("열심히 코딩합시다!");
		} else {
			System.out.println("수고하셨습니다~");
		}
		
		//sample4
		int temp =17;
		if(temp>30) {
			System.out.println("더운 날씨입니다.");
		} else if(temp >20) {
			System.out.println("적당한 날씨입니다");
		} else {
			System.out.println("추워요 추워");
		}
		
		//sample5
		int num = 0;
		
		if(num > 0) {
			System.out.print("양수입니다.");
		} else if(num < 0) {
			System.out.print("음수입니다.");
		} else { // 0보다 작지도 크지도 않음. (num==0)
			System.out.println("빵~");
		}
		
		//sample6
		
		int myAge;
		System.out.print("나이를 입력하세요: ");
		myAge = sc.nextInt();
		
		if(myAge<5) {
			System.out.print("유아입니다~");
		} else if(myAge>=5 && myAge<14) {
			System.out.print("어린이입니다~");
		} else if(myAge>=14 && myAge<20) {
			System.out.print("청소년입니다~");
		} else {
			System.out.print("성인입니다~");
		}
		
		*/
		
		//sample7: 계절 출력하기
		
		int month;
		System.out.print("계절을 알고싶은 월을 입력하세요: ");
		month =sc.nextInt();
		
		if(month==1 || month==2 || month==12) {
			System.out.println("겨울");
		} else if(month>=3 && month<=5) {
			System.out.println("봄");
		} else if(month>=6 && month <=8) {
			System.out.println("여름");
		} else if(month>=9 && month<=11) {
			System.out.println("가을");
		} else {
			System.out.println("해당하는 계절이 없습니다.");
		}
		
		
	}
}
