package com.kh.hw.student;

import java.util.Scanner;

public class StudentController {
	
	private StudentModel model;
	private StudentView view;
	
	//생성자
	public StudentController(StudentModel model, StudentView view) {
		this.model = model;
		this.view = view;
	}
	
	public void runStudent() { //뷰에 요청한 데이터를 보여줄 함수
		
		//학생정보를 입력받기
		view.displayMessage(); //학생정보를 입력하세요
	
		String name = view.displayNameMsg(); //이름:
		
		int age = view.displayAgeMsg(); //나이:
		
		double height = view.displayHeightMsg(); //키:
		
		double weight = view.displayWeightMsg(); //몸무게:
		
		int grade = view.displayGradeMsg(); //학년:
		
		String major = view.displayMajorMsg(); //전공:
		
		model.setName(name);
		model.setAge(age);
		model.setHeight(height);
		model.setWeight(weight);
		model.setGrade(grade);
		model.setMajor(major);
		
		System.out.println("이름 : " + name + "/ 나이 : " + age + "/ 키 : " + height + "/ 몸무게 : " + weight + "/ 학년 : " + grade + "/ 전공 : " + major);
		
	}
	
}
