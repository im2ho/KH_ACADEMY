package com.kh.whilesample;

import java.util.Scanner;

public class While05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("5이하의 정수를 입력해주세요 : ");
		int num = sc.nextInt(); // num: 아직 값 배정받지 X
		
		while(sum <= 10) {
			
			sum += num;
			num = num + 1;
			System.out.println("sum :" + sum);
		}
	}
}