package com.kh.instance.TV;

public class TV {
	// TV를 만들어보자!
	
	// TV의 속성(필드)
	String color; //tv색상 
	boolean power; //전원상태
	int channel;
	
	//TV의 기능(메서드)
	public void power() {
		power = !power; //전원상태
	}
	
	//
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
}
