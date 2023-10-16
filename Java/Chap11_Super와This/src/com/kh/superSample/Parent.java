package com.kh.superSample;

public class Parent {
	
	String name;
	
	Parent() {
		System.out.println("부모 클래스의 기본 생성자입니다.");
	}
	
	Parent(String name) {
		this.name = name;
		System.out.println("부모 클래스의 문자열 파라미터 생성자입니다! : " + name);
	}
	
	public void show() {
		System.out.println("부모 클래스의 show 메서드입니다.");
	}

}
