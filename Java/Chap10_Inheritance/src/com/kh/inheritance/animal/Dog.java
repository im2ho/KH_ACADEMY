package com.kh.inheritance.animal;

public class Dog extends Animal {
	
	public Dog(String name) {
		
		super(name); //부모 클래스(Animal)의 멤버(name, age)에 접근할 수 있도록 함
		
	}
	
		public void speak() {
			System.out.println(getName() + ": 월월!!!");
		}
		
}
