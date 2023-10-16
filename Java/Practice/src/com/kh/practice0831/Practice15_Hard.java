package com.kh.practice0831;

import java.util.Scanner;

public class Practice15_Hard {
	//public void practice015(){} 사용..?
	public static void main(String[] args) {
		
		//1. 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요
		Scanner sc = new Scanner(System.in); //입력받기 위해 불러오는 메소드
		System.out.print("소수 판별기\n2 이상의 자연수 하나를 입력하십시오: "); //출력 메소드
		int num =sc.nextInt();
		
		//2. 단(=if), 입력한 수가 2보다 작은 경우 "잘못 입력하셨습니다."를 출력하세요
		
		//3. 소수: n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수
		
		//4. 소수입니다. 소수가 아닙니다. 잘못 입력하셨습니다. <출력
		
		if(num<2) {//입력한 수가 2보다 작은 경우
			System.out.println("잘못 입력하셨습니다.");
		} else if(num==2) {//입력한 수 =2일 경우
			
			System.out.println("소수입니다.");
		
		} else {//입력한 수가 2보다 클 경우
			
			boolean checkNum = true; //소수인지 판별하기 위한 boolean 변수 checkNum 초기화 처음에는 소수 가정
			
			for(int i=2;i<num;i++) { //소수인지 판별을 할 수 있는 반복문
				
				if(num%i==0) {
					checkNum = false; //소수가 아님
					break; //조건 만족시 for문 break
				}
				
			} 
			
			if(checkNum==true) {
				
				System.out.print("소수입니다");
			
			} else { //checkNum == false일 경우
				
				System.out.print("소수가 아닙니다");
			
			}
		}

	}

}