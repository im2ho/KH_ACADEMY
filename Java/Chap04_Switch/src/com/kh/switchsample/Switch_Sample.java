package com.kh.switchsample;

public class Switch_Sample {
	public static  void main(String[] args) {
		
		// switch문
		
		/*
		 특정 변수나 표현식의 값에 따라 다양한 경우를 처리하는 제어 구조
		 
		 switch 문은 일련의 case 문과 해당 값을 비교하여 일치하는 경우에 해당하는 코드 블록을 실행
		 각 case문 뒤에는 일치하는 값이나 표현식이 나옴
		 
		 switch (변수 또는 표현식) {
		 	case 값1 :
		 		//값1에 해당하는 코드
		 		break; // 값이 일치할 때 (?) 해당 블록의 실행을 중단하는 역할
			case 값2 :
				//값2에 해당하는 코드
				break;
			default :
				//위 모든 케이스와 일치하지 않을 때 실행되는 코드
		 }
		 
		 */
		
		// sample1
		
		int day = 30;
		
		switch (day) { //day==30
			
			case 1: //case가 30이면 월요일 출력
				System.out.println("월요일"); //case =/=30 > 월요일 출력X
				break;
			case 2: //case가 30이면 월요일 출력
				System.out.println("화요일");
				break;
			case 30: //case가 30이면 월요일 출력
				System.out.println("수요일");
				break;
			default :
				System.out.println("주말");
		}
		
		
	
	   // sample2 (카페에서 주문하기)
		
		int choice = 4;
		
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
			System.out.println("쿨라임피지오 주문하셨습니다.");
			break;
		
		default:
			System.out.println("잘못된 선택입니다. 다시 주문해주세요~");
		}
	
		
	  // smaple3
		
		
	}

}
