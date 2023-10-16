package com.kh.practice0830;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		
		/*메뉴를 출력하고 메뉴 번호를 누르면 “OO OO메뉴입니다 를
		종료 번호를 누르면 프로그램이 종료됩니다 를출력하세요*/
		
		/**switch문**/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nSwitch문으로 주문을 해보자!\n");
		System.out.println("~~~메뉴판~~~\n1. 떡볶이\n2. 닭발\n3. 마라탕\n4. 치킨\n7. 종료\n~~~~~~~~~~~");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int choice;
		choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("떡볶이 메뉴입니다.");
				break; //break 걸어주지 않으면 조건문이 무효화가 됨
				
			case 2:
				System.out.println("닭발 메뉴입니다.");
				break;
			
			case 3:
				System.out.println("마라탕 메뉴입니다.");
				break;
				
			case 4:
				System.out.println("치킨 메뉴입니다.");
				break;
				
			case 7:
				System.out.println("프로그램이 종료됩니다.");
			
			default:
		}
				
		/**if문**/
		System.out.println("\n\nIf문으로 주문을 해보자!");
		System.out.println("~~~메뉴판~~~\n1. 떡볶이\n2. 닭발\n3. 마라탕\n4. 치킨\n7. 종료\n~~~~~~~~~~~");
		System.out.print("메뉴 번호를 입력하세요 : ");
		
		choice = sc.nextInt();
		
		if(choice==1) {
			System.out.println("떡볶이");
		} else if(choice==2) {
			System.out.println("닭발");
		} else if(choice==3) {
			System.out.println("마라탕");
		} else if(choice==4) {
			System.out.println("치킨");
		} else if(choice==7) {
			System.out.println("프로그램이 종료됩니다.");
		} else {
			System.out.println("잘못된 선택입니다.. 다시 고르세욧!!!");
		}
		
		
		}
	}


