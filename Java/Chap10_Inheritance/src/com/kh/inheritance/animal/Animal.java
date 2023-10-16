package com.kh.inheritance.animal;

public class Animal { //동물클래스 정의
	
	//어떤 동물일까요?
	private String name;
	private int age;
	
	public Animal(String name) {
		this.name = name;
		this.age = age;
	}
	
	public void setName() {
		
		this.name = name;
		
	}
	
	public String getName() {
		
		return name;	
		
	}


	
	public void info() {
		System.out.println("<이름>");
	}
	
	public void eat() {
		System.out.println(name + " 이(가) 먹이를 먹습니다.");
	}

	public void sleep() {
		System.out.println(name + "이(가) 잠을 잡니다.");
	}

	public void roar() {
		System.out.println(name + "컹컹");
	}
}
