package com.kh.whilesample;

public class While03 {
	public static void main(String[] args) {
		
		//반복적으로 출력
		
		int i =1;
		
		while (i<=10) { //i가 5보다 같거나 작을 때 true
			System.out.println(i); //while 조건이 참일 때만 출력
			i ++ ; // i = i +1;
			
			//i = i++; 넣으면 무한루프가 나오는 이유 > 1=1++, 1=1++, 1=1++ .....무한반복 > ++가 작동하지 X
			//i = ++i; 는 가능 (i에 +1을 먼저 대입했기 때문)
		}
	}

}
