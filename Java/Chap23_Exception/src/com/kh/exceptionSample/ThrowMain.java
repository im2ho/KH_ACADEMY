package com.kh.exceptionSample;

import java.util.Scanner;

/*
throw
	예외를 발생시키는 키워드
	프로그램 실행 중 예기치 않은 상황이 발생됐을 때 사용
	예외를 발생시키면 예외처리가 시작되고
	프로그램은 해당 예외를 적절히 처리하거나 상위 호출 스택 예외를 전파
	
	user 숫자를 입력해야함
	양수만 입력해야하는데 음수를 입력해버림;;;
	음수인 경우 예외를 발생시키는 간단한 예제
*/
public class ThrowMain { //같은 패키지에 네거티브넘버어쩌구 클래스와 연결됩니다
	
	public static void main(String[] args) {

		try {
			int number = getNumber(); //숫자를 가지고 옴 (getNumber()라는 메서드를 만들자)
			if(number < 0) {
				throw new NegativeNumberException("음수는 허용이 되지 않습니다."); //NegativeNumberException 예외 생성필요
			}
			System.out.println("입력한 숫자 : " + number);
		} catch(NegativeNumberException e) {
			System.out.println("예외발생ㅇ러ㅣㅏㅇㄴ리ㅏㄴ얼니ㅏ쇠ㅏ" + e.getMessage());
		}

	}
	
	public static int getNumber() {//사용자로부터 숫자를 입력받는 메서드
		//여기에서 음수를 입력하면 예외가 발생하도록
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int number = sc.nextInt();
		return number;
	}
}

/* 왜 분리해서 써야하는가 (클래스 한 번에 두 개 성성 절대 x) >같은패키지에 그대로 생성해줄게용
public class NegativeNumberException extends Exception { //Exception 상속을 받는 클래스 생성
	//NegativeNumberException : 사용자 정의 예외 클래스
	public NegativeNumberException(String msg) {
		super(msg);
	}
}
*/