package com.kh.practice0829;

import java.util.Scanner;

public class VariablePractice04 {
	public static void main(String[] args) {
		
		//영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요
		Scanner sc = new Scanner(System.in);
		
		//방법1: indexNum 활용
		System.out.print("문자열을 입력하세요: ");
		String word;
		word = sc.next();
		
		char a1 = word.charAt(0); // int index 배열개념
		//배열: 정수개념이라 첫 번째 글자 자리가 0부터 시작함
		//char: 문자를 한 글자씩 읽는다
		//apple이라는 글자는 1자리가 넘어가기 때문에.. char로 바로 읽을 수 x
		//자리위치를 charAt()으로 지정해서 읽는다
		
		char a2 = word.charAt(1);
		char a3 = word.charAt(2);
		
		System.out.println("첫 번째 문자 : " + a1);
		System.out.println("두 번째 문자 : " + a2);
		System.out.println("세 번째 문자 : " + a3);
		
		
		//방법2
		String a4 = word.substring(3,4); //char와 다르게 긴 것도 출력가능
		//substring(2,4): startIndex3부터 endIndex4 이전까지 출력
		//끝을 지정하지 않으면 시작한 인덱스 위치부터 끝까지 출력됨
		System.out.println("네 번째 문자: " + a4);
	}

}
