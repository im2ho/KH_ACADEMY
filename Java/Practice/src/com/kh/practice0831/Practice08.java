package com.kh.practice0831;

import java.util.Scanner;

public class Practice08 {
	public static void main(String[] args) {
		
		//사용자로부터 입력 받은 숫자의 단을 출력하세요.
		// 9 입력 -> 1~9단 다 출력 (9 초과하는 수 들어오면 9 이하의 숫자만 입력해주세요 출력)
		//집가서 마저 풀기..
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num>9) {
			System.out.print("9 이하의 숫자만 입력해주세욧");
		} else {
			for(int i=1;i<=9;i++) {
				
				System.out.println("+++++ " + num + " +++++");
				System.out.print(num + " * " + i + " = ");
				System.out.println(num*i);
			}
		}
	}
}
