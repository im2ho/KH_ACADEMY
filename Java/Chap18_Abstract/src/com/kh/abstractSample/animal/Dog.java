package com.kh.abstractSample.animal;

public class Dog extends Animal {
	
	String voice;
	
	//생성자
	public Dog(String name, String voice) {
		super(name);
		this.voice = voice;
	}
	
	@Override
	public void animalVoice() {
		System.out.println(name + " 울음소리 : " + voice);
	}
}
