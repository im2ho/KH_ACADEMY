package com.kh.example.practice4.model.vo;

public class Student {
	
	//1.멤버변수
	
	int grade;
	int classroom;
	String name;
	double height;
	char gender;
	
	//2.생산자 Student()
	
	public Student() { 
		// 초기화 블럭을 이용해 각 학생정보 필드 초기화 (초기화블럭{})
		grade = 3;
		classroom = 2;
		name = "최새정";
		height = 168.3;
		gender = '여';
	}
	
	
	//3.출력 메서드 + information() : void
	
	public void information() {
		System.out.println("< " + name + " 학생 정보 >\n" );
		System.out.println(grade + "학년 " + classroom + "반");
		System.out.println("성별 : " + gender);
		System.out.println("키 : " + height + "cm");
	}

}