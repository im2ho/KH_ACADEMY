package com.kh.abstractSample.animal;

public class Cat extends Animal {
	String voice;
	
	public Cat(String name, String voice) {
		super(name);
		this.voice = voice;
	}
	
	@Override
	public void animalVoice() {
		System.out.println(name + "울음소리 : " + voice);
	}
}
