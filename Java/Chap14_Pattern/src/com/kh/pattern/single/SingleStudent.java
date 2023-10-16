package com.kh.pattern.single;

public class SingleStudent {
	
	//멤버변수
	private String name;
	
	//생성자
	private SingleStudent() {
		
	}
	
	//출력메소드
	public void display() {
		System.out.println("싱글톤 학생입니다.");
	}
	
	public static void main(String[] args) {
		//객체 생성
		SingleStudent std1 = new SingleStudent(); //단순히 싱글톤패턴의... 머? 암튼 그걸 불러오는 기능..
		
		std1.display(); //출력메소드 호출

	}

}
