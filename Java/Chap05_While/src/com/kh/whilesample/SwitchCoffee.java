package com.kh.whilesample;

import java.util.Scanner;

public class SwitchCoffee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//while문을 활용한 switch
		
		/*
		int choice;
		boolean isChoice = false;
		
		while(!isChoice) { //조건이 참인 동안 코드 블록을 반복적으로 실행
			System.out.println("커피를 주문해주세요. \n1. 아메리카노\n2. 카페라떼\n3. 홍차");
			
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("아메리카노를 주문했습니다.");
					isChoice = true;
					break;
					
				case 2:
					System.out.println("카페라떼를 주문했습니다.");
					isChoice = true;
					break;
					
				case 3:
					System.out.println("홍차를 주문했습니다.");
					isChoice = true;
					break;
					
				default:
					System.out.println("잘못된 선택입니다. 다시 선택해주세요");
					
			}
			
		}
		*/
		
		int choice;
		boolean isChoice = true;
		
		while(isChoice) { //조건이 참인 동안 코드 블록을 반복적으로 실행
			System.out.println("커피를 주문해주세요. \n1. 아메리카노\n2. 카페라떼\n3. 홍차");
			
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("아메리카노를 주문했습니다.");
					isChoice = false;
					break;
					
				case 2:
					System.out.println("카페라떼를 주문했습니다.");
					isChoice = false;
					break;
					
				case 3:
					System.out.println("홍차를 주문했습니다.");
					isChoice = false;
					break;
					
				default:
					System.out.println("잘못된 선택입니다. 다시 선택해주세요");
					
			}
			
		}

	}

}
