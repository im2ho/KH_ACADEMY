package com.kh.practice0831;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.....
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.
		
		Scanner sc = new Scanner(System.in);
		
			
		System.out.print("자연수 한 개를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요");
			
		} else { // 1이상인 숫자들(자연수)
			for(int i=num ; i>=1 ;i-- ) { //거꾸로 숫자가 출력되게 하기
				System.out.print(i + " ");
			}
		}
		
		
		
		
		
		
	}

}
