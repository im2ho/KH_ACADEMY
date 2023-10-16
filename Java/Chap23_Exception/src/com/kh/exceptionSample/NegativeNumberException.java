package com.kh.exceptionSample;

public class NegativeNumberException extends Exception {
											 //Exception 상속을 받는 클래스 생성
	//NegativeNumberException : 사용자 정의 예외 클래스
	
	//Exception : 올타임 ㄹㅈㄷ 온리원 조 상
	//RuntimeException : 후손
	//IndexOutOfBound어쩌구 : 후후손
	//  ~~~ : 후후후손
	// 후후후손 > 후후손을 타고 올라가고 > 후손을 타고 가고 > 조상을 타고가고.. 그렇게 Exception을 사용합니다
	
	public NegativeNumberException(String msg) {
		super(msg);
	}
}