package com.kh.exceptionPractice;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain exmain = new PracticeMain();
		exmain.ArithException();
		exmain.NPException();
		exmain.NumFormatException();
	}
	
	public void ArithException() {
		// int dividend / divisor 나누었을 때 예외처리
		int dividend = 100;
		int divisor = 0;
		
		try {
			int result = (dividend/divisor); //0으로 나누는 시도~
			System.out.println("나누기 결과 : " + result);
		} catch(ArithmeticException a) {
			System.out.println("산술연산오류웅앵" + a.getMessage());
		}
	}
	
	public void NPException () {
		String text = "Hello World";
		String subText = null;
		
		try {
			int length = text.indexOf(subText); 
			//indexOf(): 특정문자위치찾기
			//subText에 있는 null값을 포함한 문자열 검색
		} catch(NullPointerException n) {
			System.out.println("문자열 미존재\n" + n.getMessage());
		}	
	}
	
	public void NumFormatException() {
		String text = "123.45";
		
		try {
			int number = Integer.parseInt(text); 
			//부적절한 형식의 문자열을 정수로 변환시도
			System.out.println(number);
		} catch(NumberFormatException f) { //그냥 Exception을 치면 에러 다 찾음
			System.out.println("숫자만 넣으라고\n" + f.getMessage());
		}
	}
	
}