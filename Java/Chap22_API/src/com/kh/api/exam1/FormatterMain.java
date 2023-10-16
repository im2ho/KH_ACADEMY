package com.kh.api.exam1;

public class FormatterMain {
/*
 Formatter
 문자열을 형식화 하는데 사용되는 클래스
 텍스트 출력을 원하는 형식에 맞게 포맷팅하고싶을 때 유용하게 사용
 %d %b %s %f %c...
 */
	public static void main(String[] args) {
		String name = "Say";
		int age = 27;
		double salary = 164.805;
		
		//Formatter 사용하여 문자열을 형식화
		String formatString = String.format("이름 : %s, 나이: %d, 월급: %.2f",name,age,salary); //%f 소수점 이하 자리수 지정 가능
		
		//형식화된 문자열을 출력
		System.out.println(formatString);

	}

}
