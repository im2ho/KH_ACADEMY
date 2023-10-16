package com.kh.variable;

import java.util.Scanner;

public class VariablePractice2 {
	
	public static void main(String[] args) {
		//키보드에서 정수 두 개를 입력 받아, 두 수의 합, 차, 곱, 나누기 한 몫과 나머지 출력
		
		Scanner sc = new Scanner(System.in);
		
		int inum1, inum2;
		
		System.out.println("두 개의 정수 입력이 필요합니다.");
		System.out.print("첫 번째 정수를 입력하세요 : ");
		inum1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		inum2 = sc.nextInt();
		
		System.out.print("더하기 결과: ");
		System.out.println(inum1 + inum2);
		
		System.out.print("빼기 결과: ");
		System.out.println(inum1 - inum2);

		System.out.print("곱하기 결과: ");
		System.out.println(inum1 * inum2);

		System.out.print("나누기 결과: ");
		System.out.print(inum1 / inum2);

	}
	
}
