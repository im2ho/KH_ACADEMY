package com.kh.hw.student;

public class StudentMain {
	public static void main(String[] args) {
		
		StudentModel m = new StudentModel();
		StudentView v = new StudentView();
		StudentController c = new StudentController(m,v);
		
		c.runStudent();
		//다시 하시겠습니까는 어떻게 출력하는가
	}
}