package com.kh.practice0831;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int sum =0 ;
		
		for(int i=1 ;i<=num ;i++ ) {
			
			System.out.print(i + " + ");
			sum = sum + i;
		}
		
		System.out.print("=" + sum );
	}

}
