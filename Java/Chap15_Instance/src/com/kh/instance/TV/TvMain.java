package com.kh.instance.TV;

public class TvMain {

	public static void main(String[] args) {
		
		TV tv; //TV인스턴스를 참조하기 위해 변수 tv선언
		tv = new TV(); //TV인스턴스 생성 (메모리에 '공간'확보) 그 이름이 tv올시다
		//공간의 위치는 아직 몰라용 (그냥 머 아파트로 치면 18평 세대만 확보해둔 것임..)
		
		//객체의 주소를 참조변수 tv에 저장한다
		
		//TV tv1 = new TV();
		
		tv.channel = 7; //TV 인스턴스의 멤버변수 channel의 값을 7로 초기화
		tv.channelDown(); //TV 인스턴스의 메서드 channelDown 호출
		tv.power(); //메서드호출
		System.out.println("Channel : " + tv.channel);

	}

}
