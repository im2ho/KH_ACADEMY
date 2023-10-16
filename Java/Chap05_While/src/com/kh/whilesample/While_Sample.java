package com.kh.whilesample;

import java.util.Scanner;

public class While_Sample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// While문
		/*
		 특정 조건이 참인 동안에 반복적으로 코드 블록을 실행하는 제어 구조
		 
		 조건이 참인지 거짓인지 검사한 후, 조건이 참인 동안 코드 블록이 반복적으로 실행 됨
		 조건이 거짓이면 반복이 중지 됨
		 
		 **while문의 특징
		 	1) while문의 조건이 참인 돋안 코드 블록을 계속해서 반복적으로 실행
		 	2) 조건이 처음부터 거짓이면 코드 블록은 실행되지 않음
		 	3) 조건이 항상 참이라면 무한 루프에 빠질 수 있으므로 조심해야함
		 	4) 코드블록 실행 전에 검사하기 때문에 조건이 처음부터 거짓이면 실행되지 않음
		 	
		 while (조건) {
		 	//조건이 참인 동안 실행될 코드
		 	}
		 
		 */
		
		
		int count = 1 ;
		
		while (count <=5) {
			System.out.println("반복 : " + count);
			count ++; // 반복 횟수를 증가시킴
		}
		
		

	}

}
