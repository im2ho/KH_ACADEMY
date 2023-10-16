package com.kh.abstractSample.animal;
//추상클래스 만들기
abstract class Animal { //구현도 제대로 안된거에 굳이 접근제한을? 써도 그만 안써도 그만
	//동물 이름~
	String name;
	
	//추상 메서드 (동물 울음소리)
	abstract void animalVoice();
	
	//생성자
	public Animal(String name) {
		this.name = name;
	}
	
	//일반 메서드
	public void displayName() {
		System.out.println("동물이름 : " + name);
	}

}
