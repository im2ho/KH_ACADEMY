package com.kh.finalSample;

import java.util.ArrayList;

public class MyMusic {
	
	public static void main(String[] args) {
		MyMusic music = new MyMusic();
		music.runMusic();
	}
	
	public void runMusic() {
		//class형으로 받기..
		ArrayList<Music> list = new ArrayList<Music>();
		list.add(new Music("발라드", "구성짐"));
		list.add(new Music("힙합", "스껄"));
		list.add(new Music("댄스", "신남"));
		//list.add("음악");
		
		for(int i=0 ; i<list.size() ; i++) {
			Music m = list.get(i);
			System.out.println(m.getType() + ", " + m.getFeeling()); //주소값출력
		}
		
	}
}
