package com.kh.inheritance.animal;

public class Cat extends Animal {
	
	public Cat(String name) {
		
		super(name);
		
	}
	
	public void run() {
		System.out.println(getName() + ": 주인이 와서 달린다~ 집사왔냐옹");
	}
}
