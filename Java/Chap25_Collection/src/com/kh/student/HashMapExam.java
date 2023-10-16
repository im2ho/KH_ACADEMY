package com.kh.student;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {

	public static void main(String[] args) {
		// HashMap 생성
		Map<String, Integer> studentGrades = new HashMap<>();
		
		// 학생, 점수 추가
		studentGrades.put("KENSO", 95);
		studentGrades.put("KYO", 100);
		studentGrades.put("RUGAL", 41);
		studentGrades.put("EN", 67);
		
		// 특정 학생의 성적 검색
		// containsKey : 맵에서 ''Key(키)'', value(값)이 있는지 확인
		String studentName = "KENSO";
		// 만약에 학생들 중에서 Bob이 있다면 성적을 보여줘
		if(studentGrades.containsKey(studentName)) {
			int grade = studentGrades.get(studentName);
			System.out.println(studentName + "의 성적 : " + grade);
		} else {
			System.out.println(studentName + "의 성적을 찾을 수 없습니다;;");
		}
		
		
		/* Map.Entry : 인터페이스와 함께 사용되는 인터페이스
		//getKey():객체의 키를 반환
		//getValue(): 객체의 값을 반환
		*/ 
		//모든 학생과 성적 출력
		System.out.println("===전체 학생 성적===");
		for(Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
			//향상for문어쩌구
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
		
		
		// 학생 성적을 잘못 입력했다.. 수정이 필요해
		String StudentUpdate = "KENSO";
		int newGrade = 98;
		studentGrades.put(StudentUpdate, newGrade);
		System.out.println(StudentUpdate + "의 성적을 " + newGrade + "로 수정했습니다..");

		// 학생 제거
		String removeStudent = "KYO";
		studentGrades.remove(removeStudent);
		System.out.println(removeStudent + "의 성적을 삭제했습니다");
		
		// 최종 학생 성적 출력
		System.out.println("최종 학생 성적 : ");
		for (Map.Entry<String,Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + ":" + age);
		}
	}

}