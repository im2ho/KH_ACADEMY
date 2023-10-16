package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student; //import위치 주의 (student 클래스가 이전에 만든게 또 있어서..)

public class StudentRun {
	
	//실행용 메소드로 기본 생성자를 통해 Student 객체 생성 후 information()으로 정보 출력
	 
	public static void main(String[] args) {
		
		//기본 생성자를 통해 Student 객체 생성
		Student student1 = new Student();
		
		//정보 출력
		student1.information();

	}

} 