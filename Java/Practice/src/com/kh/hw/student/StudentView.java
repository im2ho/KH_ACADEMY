package com.kh.hw.student;

import java.util.Scanner;

public class StudentView { 
	
	//학생 정보 넣기
	
	Scanner sc = new Scanner(System.in);
	
	public void displayMessage() {//최초메세지
		System.out.println("학생정보를 입력하세요");
	}
	
	private String nameMsg = "이름 : ";
	public String displayNameMsg() {
		System.out.print(nameMsg);
		return sc.next();
	}
	
	private String ageMsg = "나이 : ";
	public int displayAgeMsg() {
		System.out.print(ageMsg);
		return sc.nextInt();
	}
	
	private String heightMsg = "키 : ";
	public double displayHeightMsg() {
		System.out.print(heightMsg);
		return sc.nextDouble();
	}
	
	private String weightMsg = "몸무게 : ";
	public double displayWeightMsg() {
		System.out.print(weightMsg);
		return sc.nextDouble();
	}
	
	private String gradeMsg = "학년 : ";
	public int displayGradeMsg() {
		System.out.print(gradeMsg);
		return sc.nextInt();
	}

	private String majorMsg = "전공 : ";
	public String displayMajorMsg() {
		System.out.print(majorMsg);
		return sc.next();
	}

}
