package com.kh.whilesample;

public class While04 {
	public static void main(String[] args) {
		
		// 1부터 100까지 합 구하기
		
		int sum = 0; //최종합
		int num = 1;
		
		while(num<=5) { //true 조건
			sum += num; //sum = sum + num;
			num = num + 1;
		}
		System.out.print("1부터 100까지의 합은 " + sum + "입니다");
		/*
		 while이 종료되었다고해서 클래스가 종료된 것은 아님
		 while문이 종료된 후 남아있는 코드 System.out.print(sum)이 출력됨
		 */
		
	}

}