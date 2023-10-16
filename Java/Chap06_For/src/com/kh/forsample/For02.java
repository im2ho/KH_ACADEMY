package com.kh.forsample;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		
		// 구구단 계산기 만들기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int result = 0; //최초값을 0으로 줍니다.
		for (int i =1 ; i <=num2; i++) {
			
			
			//result += num1;
			result = num1 + result;
			System.out.println(num1 + " * " + i + " = " + result);
	
		}
		
		//계산된 결과를 출력 입력받은 두 숫자와 결과 값을 문자열로 결합해서 출력
		
		// 이중 for 문
		
		
	}
	
}