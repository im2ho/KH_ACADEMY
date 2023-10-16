package com.kh.pattern.mvc.Model;

public class UserModel {
	/*
	1. 유저 정보를 어떻게 표현할 것인가? ex) 학생 정보를 이름과 나이로 표현합시다~
	private 이름 나이
	getter setter 만들기
	*/
	
	private String name;
	private int age;
	
	public UserModel (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
