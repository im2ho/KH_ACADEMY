package com.kh.classSample;

public class Student {
	//1. 멤버변수 (학생의 속성)
	String name; //학생들의 이름
	int age; //학생들의 나이
	String grade; //학생들의 학년
	
	/***** 생성자 (메서드 중 일부) *****/
	public Student(String name, int age, String grade) {//학생들을 초기화
		this.name = name;
		this.age = age; //
		this.grade = grade;
	}
	
	//2. 학생 정보 출력 메서드
	public void displayInfo() {
		System.out.println("학생 이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("학년 : " + grade);
	}

}

/**
메서드(Method) :
특정 작업을 수행하기 위한 코드블록 함수. 
클래스 내에 정의되며, 클래스의 객체들이 해당 메서드를 공유하여 사용할 수 있음
	객체의 상태를 변경하거나 객체에 대한 작업을 수행하는데 사용
	
	ex) System.out.println(); :  출력 메서드
	
매개변수(Parameter) :
	 함수의 정의에서 전달 받은 인수를 함수 내부로 전달하기 위해 사용하는 변수
**/