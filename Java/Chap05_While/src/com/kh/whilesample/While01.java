package com.kh.whilesample;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		
		while(isTrue){ //isTrue = true이기 때문에 true 대신 isTrue 사용
			System.out.print("\n1. 아메리카노\n2. 카푸치노\n3. 밀크티\n\n커피를 주문해주세요 : ");
			int choice = sc.nextInt(); //while안으로 이동
			
			switch(choice) {
				case 1:
				System.out.println("아메리카노 주문하셨습니다");
				isTrue = false; //아메리카노 주문을 받았으니 while문을 종료하기 위해서 false를 넣는다
				break;
				
				case 2:
				System.out.println("카푸치노 주문하셨습니다");
				isTrue = false;
				break;
				
				case 3:
				System.out.println("밀크티 주문하셨습니다");
				isTrue = false;
				break;
				
				default:
				System.out.println("잘못된 선택입니다. 다시 주문하세욧!\n");
			}
		}

	}

}
