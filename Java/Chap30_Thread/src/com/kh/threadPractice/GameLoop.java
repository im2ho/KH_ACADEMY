package com.kh.threadPractice;

import java.util.Random;

public class GameLoop implements Runnable{
	
	static boolean isGameOver = false; //static변수로 박아버리기
	
	@Override //run()을 오버라이딩 명시
	
	public void run() {
		
		while(!isGameOver) {
			
			int randomValue = new Random().nextInt(88);
			System.out.println("임의의 숫자 : " + randomValue);
			
			try {
				Thread.sleep(1000); // 1초 sleep 상태
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		System.out.println("게임 종료를 원하면 Enter키를 눌러주세요");
		
		}
		// while문 탈출 시 나오는 메시지
		System.out.println("게임이 종료되었습니다");
	}
}