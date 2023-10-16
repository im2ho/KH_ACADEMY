package com.kh.threadPractice;

public class GameMain extends GameLoop { //GameLoop 상속

	public static void main(String[] args) {
		
		// 게임 루프 스레드를 시작하는 곳
		// 스레드 가져오기.......~
		Thread gameThread = new Thread(new GameLoop()); // gameThread라는 인스턴스 생성
		gameThread.start(); //GameLoop스레드를 실행하궛어요~
	
		/**
		 GameMain s = new GameMain(); //인스턴스 생성 후
		 Thread gameThread = new Thread(s.new GameLoop()); //가 되지 않는 이유?
		**/
		
		// 게임의 종료 조건 설정 (Enter를 입력하면 isGameOver가 true가 됨)
		
		
		try {
			System.in.read(); //입력값을 받는 메서드
			isGameOver = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// trycatch문을 GameLoop에 넣으면 안되는 이유
	}

}
