package com.kh.finalSample;

public class Music {
	
	//멤버변수
	private String type;
	private String feeling;
	
	public String getType() {
		return type;
	}

	public String getFeeling() {
		return feeling;
	}
	
	//생성자
	public Music(String type, String feeling) {
		this.type = type;
		this.feeling = feeling;
	}
	
}
