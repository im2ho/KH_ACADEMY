package com.kh.api.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PracticeMain3 {
	
	public void practice2() {
		//날짜 형식 출력
		Date currentDate = new Date();
		SimpleDateFormat smDF = new SimpleDateFormat("yyyy-MM-dd");
		String formatStr = String.format("현재 날짜 : %s", smDF.format(currentDate));
		System.out.println(formatStr);
	}
	
	public void practice3() {
		int num1 = 123;
		int num2 = 7;
		//숫자가 지정되 넓이보다 짧을 경우 앞에 0으로 채워주겠다
		//출력되는 숫자의 최소 너비 : 5자리
		String numbers = String.format("숫자1: %05d\n숫자2: %05d", num1, num2);
		System.out.println(numbers);
	}

	public void practice4() {
		String text1 = "Hello";
		String text2 = "World";
		//10은 문자열의 최소 너비 (공간 10자리 차지)
		//만약 문자열이 10자리보다 짧다면 왼쪽이 공백으로 채워짐
		//만약 문자열이 -10자리보다 짧다면 오른쪽이 공백으로 채워짐
		//작은 따옴표(')로 둘러쌓아야함
		String formatStr = String.format("'%-10s' '%10s'",text1, text2);
		System.out.println(formatStr);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PracticeMain3 p = new PracticeMain3();
		p.practice2();
		p.practice3();
		p.practice4();
	}

}
