package com.kh.abstractSample.animal;

public class Dog extends Animal {
	
	String voice;
	
	//积己磊
	public Dog(String name, String voice) {
		super(name);
		this.voice = voice;
	}
	
	@Override
	public void animalVoice() {
		System.out.println(name + " 匡澜家府 : " + voice);
	}
}
