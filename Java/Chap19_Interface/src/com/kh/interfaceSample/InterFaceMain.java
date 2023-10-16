package com.kh.interfaceSample;

public class InterFaceMain {

	public static void main(String[] args) {
		MyInterface myin = new MyClass();
		//MyInterface 변수명 = new MyInterface(); > 객체가 아니기 때문에 생성 불가
		myin.doMyInterface();
	}

}
