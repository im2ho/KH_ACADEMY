package com.kh.classSample;

public class StudentMain {

	public static void main(String[] args) {
		/**
		
		// 학생의 객체 생성
		Student student1 = new Student("칸쵸",18,"2학년");
		
		// 학생 정보 출력
		student1.displayInfo();
		
		**/
		
		/*
		학생을 3명 만들어서 3명 출력하기
		student2, student3, student4
		*/
		
		//학생 3명의 객체 생성~
		Student student2 = new Student("이정현",20,"3학년");
		Student student3 = new Student("김민주",18,"2학년");
		Student student4 = new Student("배소연",18,"2학년");
		
		//학생정보 출력 메서드 호출
		student2.displayInfo();
		student3.displayInfo();
		student4.displayInfo();

	}

}
