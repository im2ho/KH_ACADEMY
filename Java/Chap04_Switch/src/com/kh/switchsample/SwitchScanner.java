package com.kh.switchsample;

import java.util.Scanner;

public class SwitchScanner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		int choice;
		System.out.println("~~~~~메뉴판~~~~~\n1. 아메리카노\n2. 카페라떼\n3. 아인슈페너\n4. 쿨 라임 피지오\n~~~~~~~~~~~~~~~\n");
		
		System.out.print("주문하실 번호를 선택해주세요 : ");
	
		choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("아메리카노 주문하셨습니다.");
			break;
			
		case 2:
			System.out.println("카페라떼 주문하셨습니다.");
			break;
			
		case 3:
			System.out.println("아인슈페너 주문하셨습니다.");
			break;
			
		case 4:
			System.out.println("쿨 라임 피지오 주문하셨습니다.");
			break;
			
		default:
			System.out.println("잘못된 선택입니다. 다시 주문해주세요.");
		}
		*/
		
		//scanner를 이용해서 과자를 선택하는 switch
		
		System.out.println("~~~~~메뉴판~~~~~\n1. 꼬깔콘\n2. 꼬북칩\n3. 포테토칩\n4. 칸츄리콘\n~~~~~~~~~~~~~~~\n");
		System.out.print("과자를 번호로 선택해주세요 : ");
		
		int snack = sc.nextInt();
		
			
		switch (snack) {
		
			case 1:
				System.out.println("꼬깔콘 선택하셨습니다.");
				break;
				
			case 2:
				System.out.println("꼬북칩 선택하셨습니다.");
				break;
				
			case 3:
				System.out.println("포테토칩 선택하셨습니다.");
				break;
				
			case 4:
				System.out.println("칸츄리콘 선택하셨습니다.");
				break;
				
			default:
				System.out.println("잘못된 선택입니다. 다시 주문하세욧!");
			}
		
		
	}

}
