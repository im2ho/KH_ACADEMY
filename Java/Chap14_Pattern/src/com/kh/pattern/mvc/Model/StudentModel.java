package com.kh.pattern.mvc.Model;

public class StudentModel { //학생의 정보를 어떻게 표현할 것인가?
	
	/* ↓↓↓ 학생의 정보를 이름과 나이로 표현하기로 했습니다~ */
	private String name; //학생 이름
	private int age; //학생 나이
	
	
	public StudentModel(String name, int age) {
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