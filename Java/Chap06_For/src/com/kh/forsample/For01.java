package com.kh.forsample;

public class For01 {
	public static void main(String[] args) {
		
		//for문: 프로그래밍에서 반복 작업을 수행하기 위해 사용되는 제어구조
		/*
		 특정한 조건이 만족하는 동안 코드 블록을 반복 실행하는데 사용
		 대부분의 프로그래밍 언어에서 for문이 가진 구조
		 
		 for (초기화 ; 조건 ; 증감) {
		 	//조건이 참일 경우 반복적으로 실행할 코드
		 }
		 
		 초기화: 반복문이 시작될 때 (최초 1회)한 번만 실행되는 부분으로, 반복 변수를 초기화 하는 역할을 한다.
		 조건: 반복문이 실행될 조건을 검사하는 부분으로, 조건이 참일 경우에만 반복코드 블록 실행 후 실행
		 증감식: 반복 변수를 증가시키거나 감소시키는 부분으로, 반복 코드 블록 실행 후 실행
		 
		 */
		
		/*
		for(int i=1 ; i<=5 ; i++) {
			//조건 i<=5 참일 경우에 실행되는 공간
			System.out.println(i);
		}
		
		for(int i=0 ; i<=5 ; i++) {
			System.out.println("i의 값: " + i);
		}
		
		for(int i=2 ; i<=7 ; i++) {
			System.out.println("i : " + i);
		}
		
		for(int i=10 ; i>=5 ; i--) {
			System.out.println("i - 값 : " + i);
		}
		*/
		
		int sum = 0;//반복문 안에 있는 sum을 위해 변수 초기화 필요
		
		for(int i=1 ; i<=10 ; i++) {
			//합
			sum += i;
			System.out.println("1부터 10까지의 합 : " + sum);
		}
		
		
		// sum의 합이 1~5의 합으로 출력하기
		int sum2 = 0 ;
		for(int j=1 ; j<=5 ; j++) {
			sum2 = sum2 + j;
		} System.out.println("1부터 5까지의 합 : " + sum2);
		
		//
		int sum3 = 10;
		for(int k=5;k>=2;k--) {
			sum3 -= k ; //sum3 = sum3-k
			System.out.println(sum3);	
		}
		
		//
		int mul = 1; //곱하기 적용할거임...
		for(int l= 1 ; l<=9 ; l++) {
			mul = 2*l;
			System.out.println("구구단 : " + mul);
			
		}
		
		
	}

}
