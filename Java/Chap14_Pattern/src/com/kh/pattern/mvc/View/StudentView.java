package com.kh.pattern.mvc.View;

public class StudentView {
	// 학생 정보를 화면에 출력
	
	public void displayInfo(String studentname, int studentage) {
		System.out.println("유저 정보");
		System.out.println("이름 : " + studentname);
		System.out.println("나이  : " + studentage);
	}
}
