package com.kh.variable;

public class VariableSample {
	public static void main(String[] args) {
		/*
		String name, name2, name3;
		name = "쿠팡";
		
		int hour = 15;
		double score = 90.5;
		char grade = 'A';
		System.out.println("안녕하세요. " + name + "입니다. 오늘 " + hour + "시에 배송됩니다.");
		System.out.println("저의 성적은 " + score + "입니다.");
		System.out.println(score+ "은(는) 학점 " + grade + "입니다.");
		*/
		
		//변수에 이름과 나이와 자신의 성적(double)로 넣기.
		int userNumber = 201721771;
		String userName = "나세희";
		int userAge = 27;
		double userScore = 100;
		char userGrade = 'A';
		
		System.out.println(userNumber +": " + userName + "님(" + userAge+ ")의 화폐금융론 성적은 " + userScore +"점으로, "+ "학점 산출 결과 " + "'" + userGrade + "'입니다.");
		
		
	}

}