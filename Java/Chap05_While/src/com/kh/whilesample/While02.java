package com.kh.whilesample;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		boolean isMonth = false;
		
		while(!isMonth) { // !:조건문을 반대로 만들어줌(false를 true로 표기)
			
			System.out.print("계절을 선택해 주세요 : ");
			int month = sc.nextInt();
			
			switch(month) {
				case 12: case 1: case 2: //case를 나열해서 표기 가능 (나열된 것 중 하나라도 참이면 출력)
					System.out.print(month + "월은 겨울입니다.");
					isMonth = true; 
					// 위 !가 있을경우 참은 거짓으로 변경되고, 거짓은 참으로 변경되기 때문에.. true로 작성해주어 !를 만나 false로 변경해 while문을 중료해준다 
					break; //break는 case문에서 실행하고자 하는게 종료된 후 한 번만 사용한다~
				
				case 3: case 4: case 5: 
					System.out.println(month + "월은 봄입니다.");
					isMonth = true;
					break;
				
				case 6: case 7: case 8: 
					System.out.println(month + "월은 여름입니다.");
					isMonth = true;
					break;
				
				case 9: case 10: case 11: 
					System.out.println(month + "월은 가을입니다.");
					isMonth = true;
					break;
				
				default:
					System.out.println(month + "월은 없는 날짜입니다. 다시 선택해주세요");
					
			}
		}
		
		*/
		
		//놀이공원을 입장하는데 9살 이상만 티켓을 구매할 수 있기 때문
		//나이를 입력받아 성인(19~20) 청소년(14~18) 어린이(10~13)로 분류하고 출력하기. 이외 나이는 다시 입력 필요
		//조건: while switch case 이용해서 출력하기
		
		boolean	isAge = false;
		
		//while(조건)
		while(!isAge) {
			System.out.print("\n나이를 선택해 주세요 :");
			int age = sc.nextInt();
			
			switch(age) {
				case 19: case 20:
					System.out.println(age + "세는 성인요금입니다.");
					isAge = true; //isAge 조건이 !를 만나 false가 되어 while문 종료
					break; //case와 switch를 (제어)종료시키는 장치
					
				case 14: case 15: case 16: case 17: case 18:
					System.out.println(age + "세는 청소년 요금입니다.");
					isAge = true;
					break;
					
				case 10: case 11: case 12: case 13:
					System.out.println(age + "세는 어린이 요금입니다.");
					isAge = true;
					break;
					
				default:
					System.out.println("잘못된 나이 입력입니다. 다시 선택해주세요\n");
			}
		}


	}

}
