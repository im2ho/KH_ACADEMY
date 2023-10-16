package com.kh.goodExam.game;

public class GameView { //게임의 결과를 보여줌
	//Vies : 전부 출력 메서드로 구성
	//멤버변수 생성 후 메서드에 적용할 것임..
	
	private String startMsg = "숫자 맞추기 게임을 시작합니다.";
	private String startMsg2 = "1 ~ 100 사이의 숫자를 맞춰보세요!";
	
	public void displayMessage() {
		System.out.println(startMsg);
		System.out.println(startMsg2);
	}
	
	//숫자를 추측하는 값 입력하고 맞췄는지 틀렸는지 적는거랑 시도횟수 & 게임종료
	
	//1. 숫자 추측하는 값 입력하기
	private String scanMsg = "추측한 숫자를 입력하세요 : ";
	public void displayGuessPrompt() {
		System.out.print(scanMsg);
	}
	
	private String correctMsg = "숫자를 맞췄습니다.";
	public void displayCorrectGuess() { 
		System.out.println(correctMsg);
	}
	
	private String incorrectMsg = "땡~ 다시 시도하세요^^";
	public void displayIncorrectGuess() {
		System.out.println(incorrectMsg);
	}
	
	private String attemptMsg = "시도횟수 : ";
	public void displayAttempts(int attempts) {
		System.out.println(attemptMsg + attempts);
	}
	
	private String upMsg = "up";
	public void displayUp() {
		System.out.println(upMsg);
	}
	
	private String downMsg = "down";
	public void displayDown() {
		System.out.println(downMsg);
	}
	
	private String gameoverMsg = "게임이 종료되었습니다";
	public void displayGameOver() {
		System.out.println(gameoverMsg);
	}

}
