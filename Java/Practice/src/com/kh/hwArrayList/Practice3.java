package com.kh.hwArrayList;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		/*
		사용자로부터 5개의 정수를 입력받아서 배열에 저장한다음,
		향상된 for 문을 사용해서 배열의 모든 요소를 더한 결과 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 5개를 입력하세요 : ");
		
		int[] numbers = new int[5]; //장바구니 만들어주기
		
		//배열에 5개의 정수를 입력하는 for문
		for(int i = 0; i <= 4; i++) {
			System.out.println("정수 index[" + (i) + "] : ");
			numbers[i] = sc.nextInt();
			/*
			ArrayList 경우 colors.get(0)
			//배열은 [] 안에 넣음
			//근데 배열의 자리가 없네? 배열의 자리 먼저 만들어줘야겠다..
			//바깥에다가 int numbers 이녀석의 배열을 만들어줘야지!
			//for문이 시작하기 전에 전체적인 장바구니는 만들어줘야지 (line17)
			*/
		}
		
		//배열의 모든 요소를 더한 결과 출력
		//조건이 최종까지 더하는 것이기 때문에 향상된 for문 사용
		//또는 기본 for을 사용하고싶다면 length 이용해서도 출력 가능
		
		int sum = 0;
		//	 숫자 한 개씩 : 전체숫자
		for(int number : numbers) {
			sum += number;
		}
		
		//합산된 결과 출력
		System.out.println("배열의 모든 요소를 더한 결과 : " + sum);
	}

}
