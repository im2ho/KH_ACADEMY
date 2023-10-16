package com.kh.arraysample;

public class TwoArray { //이중배열

	public static void main(String[] args) {
		
		// 이중 문자열 배열 선언과 초기화
		String[][] fruits = {
				{"Apple", "Banana", "Cherry"},
				{"Grapes", "Orange", "Strawberry"},
				{"Kiwi", "Mango", "Pineapple"}
		};
		
		System.out.println("fruits.length : " + fruits.length + "\n");

		for (int i = 0 ; i < fruits.length ; i++) { //행을 나타내는 첫 번째 포문
			System.out.println(i + "행");
			for(int a = 0 ; a < fruits[i].length ; a++) { //열을 나타내는 두 번째 포문
				System.out.print(fruits[i][a] + " ");
				System.out.print(a + "열" + " / ");
			}
			System.out.println(); //다음행으로 이동할 수 있게 enter용 출력 메소드 입력
		}
		
	}

} 
