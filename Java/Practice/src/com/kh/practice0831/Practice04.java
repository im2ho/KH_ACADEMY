package com.kh.practice0831;

import java.util.Scanner;

public class Practice04 {
	
	public static void main(String[] args) {
		// Practice03 + 바른 입력값이 나올 때까지 반복하기 추가
		
		Scanner sc = new Scanner(System.in);
		
		boolean isPrime = true;
		
		while(isPrime) {
			System.out.print("자연수 한 개를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num<1) {
				System.out.println("잘못된 숫자입니다. 다시 입력해주세요");
				isPrime=true;
			} else {
				for(int i= num ; i>=1 ;i-- ) { //for문 내부를 완성하세요
					System.out.print(i + " ");
				}
				isPrime = false;
			}
		}
		
		
		}
		
	}
