package com.kh.practice0831;

import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {
		/*
		 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			for(;num2<=num1;num2++) {
				System.out.print(num2 + " ");
				}
			} else {
				for(;num1<=num2;num1++) {
					System.out.print(num1 + " ");
				}
			}
		
	}
	
//restart 와 reEnd.....등등 변수 새로 생성하는 방법도 있다... (근데 이건 왜 굳이..)

	/**
 	방법2. Math: 자바 내장 클래스
	- min(가장 작은 값): 주어진 두 개의 숫자 중에서 더 작은 값을 반환
	- max(가장 큰 값): 주어진 두 개의 숫자 중에서 더 큰 값을 반환
	 **/

	/*
	 코드는 선생님 깃허브 참고
	 */

}