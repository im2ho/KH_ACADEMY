package com.kh.inheritance.animal;

public class Lion extends Animal{
	
	public Lion(String name) {
		
		super(name);
		
	}
	
	@Override //override를 해준다고 명시했음
	public void roar() {
		System.out.println(getName() + ": 으르렁으르렁대");
	}

}
