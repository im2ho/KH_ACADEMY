package com.kh.arraysample;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		
		// Array (배열): 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		
		/*
		 1. 동일한 데이터 타입을 가진 여러 값을 한 곳에 저장하고 인덱스를 사용하여 각 값에 접근할 수 있도록 제공
		 
		 2. 배열은 프로그램에서 데이터를 보다 효율적으로 저장하고 관리하는데 사용됨
		 
		 3. 데이터의 집합을 쉽게 다룰 수 있도록 도와줌!
		 
		 **배열의 구조
		 	
		 	~~~배열 생성 및 초기화~~~
		 	데이터타입[] 배열이름		=	new 데이터타입[크기]
		 
		 **특징
		 	1) 고정된 크기 : 생성할 때 크기가 결정되고, 크기가 고정되어있음 > 생성 후 크기 변경 불가
		 	
		 	2) 같은 데이터 타입 :  배열 내에 모든 요소는 동일한 데이터 타입을 가져야 함
		 		ex) int타입의 배열은 모든 요소가 정수
		 		
		 	3) index 기반 접근: 각 배열 요소는 순차적인 인덱스를 가지며, 0부터 시작해서 배열크기 -1까지의 값을 가짐
		 		> 인덱스를 사용해서 큭정 위치에 있는 요소 접근 가능
		 			ex) 배열크기를 '5'로 지정한다면, index는 0 ~ 4
		 	
		 	4) 배열의 길이(length) : 배열의 길이를 알 수 있다~
		 */
		
		int score1, score2, score3, score4, score5;
		// 지금은 변수가 3 개지만..score가 100개라면? > 배열 사용
		
		// int 타입 배열 생성
		
		String[] nameArray = new String[2];
		//String[] stringArray = {"","",""}; >자리만 만들어둔 모양
		
		
		String[] seatArray = {"나루토","카카시","사스케"};
		//만들어진 자리에 배치까지 완료
		
		String[] stringArray = new String[4];
		stringArray[0]="디아루가";
		System.out.println("stringArray : " + stringArray[0]); //디아루가
		System.out.println("stringArray : " + stringArray[1]);
		System.out.println("stringArray : " + stringArray[2]);
		System.out.println("stringArray : " + stringArray[3]);
		//if지정하지 않은 범위 지정시, 에러 발생
		
		String[] food = {"칸쵸", "새우깡", "엽떡", "곱창전골"}; //index 3짜리
		int foodLength = food.length;
		System.out.println("food 배열의 길이 : " + foodLength);
			
	}

}
