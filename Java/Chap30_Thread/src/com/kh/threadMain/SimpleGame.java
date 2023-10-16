package com.kh.threadMain;

import java.io.IOException;
import java.util.Random;

// 이것이 멀티스레드다~
public class SimpleGame {
	
	private static boolean isGameOver = false; // static 변수로 넣어버리기~
	
	public static void main(String[] args) {

		// 게임 루프 스레드 시작하는 곳~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 외부 클래스의 인스턴스를 생성..
		SimpleGame s = new SimpleGame();
		
		// 스레드 가져오기
		Thread gameThread = new Thread(s.new Gm()); // 생성한 인스턴스 참조변수 어쩌구
		gameThread.start();
		
		// 게임 종료 조건 : 플레이어가 Enter 키를 누르면 게임 종료
		try {
			System.in.read();  
			//사람들이 입력한 키보드를 byte 단위로 읽어주궛어요? > trycatch도 생성해주세용^^
			//사용자가 Enter키를 누를 때까지 프로그램 일시 중지 (메신저, 대화 입력받을 때 쓸 듯..)
			
			isGameOver = true;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	class Gm implements Runnable{ //한 번 더 써보궛어요.....
		//중첩 클래스 꼴로 만들보자...
		@Override
		public void run() {
			while(!isGameOver) {
				//게임 루프 내용을 넣궛어요.....
				int randomValue = new Random().nextInt(88);
				System.out.println("임의의 숫자 : " + randomValue);
				
				//게임 루프 지연 시간
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// 게임 종료 조건 안내
				System.out.println("게임을 종료하려면 Enter키를 눌러주쉐이");
			}
			System.out.println("게임 끝!");
		}
	}

}