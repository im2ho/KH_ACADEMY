package com.kh.inheritance.animal;

public class Monkey extends Animal {
	
	public Monkey(String name) {
		
		super(name);
	
	}
	
	@Override //override를 해준다고 명시했음
	//내가 쓴 코드를 문장으로 말하는거임
	//내가 잠을 잔다를 쓴다면 거꾸로 자니까라는걸 출력해줘
	//출력메소드
	public void sleep() {
		System.out.println(getName() + ": 나무에서 자다가 떨어질 수 있음");
	}
}