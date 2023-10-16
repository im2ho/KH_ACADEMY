package com.kh.goodExam.game;
//랜덤 숫자 맞추기 게임 모델
public class GameModel {
	private int secretNumber; //숨겨진 번호
	private int attempts; //몇 번 시도했는가?
	
	public GameModel() {
		//1~100 범위의 무작위 숫자 생성하기 with형변환
		secretNumber = (int) (Math.random() *100)+1;
		attempts = 0; //최초 시도는 0번
	}
	
	//컴퓨터가 랜덤으로 추측한 숫자 한 개
	public int getSecretNumber( ) {
		return secretNumber;
	}
	
	public int getAttempts() {
		return attempts;
	}
	
	public void incrementAttempts() {
		attempts++;
	}
	
	public boolean inCorrectGuess(int guess) {
		//guess가 값을 입력했기 대문에 증가 메서드를 추가
		incrementAttempts(); 
		return guess == secretNumber;
		//숫자맞는지 확인해주는 리턴 메서드
	}
}