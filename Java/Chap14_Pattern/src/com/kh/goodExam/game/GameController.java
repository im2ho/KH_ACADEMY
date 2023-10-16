package com.kh.goodExam.game;

import java.util.Scanner;

public class GameController {
	
	private GameModel model; //멤버변수이자 객체 내 지역변수
	private GameView view;

	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}
	
	public void runGame() {
		
		//최초 메세지 보여주는거 출력하고
		view.displayMessage();
		//스캐너 입력해서 입력값 호출
		Scanner sc = new Scanner(System.in);
		
		while(true) { //boolean isTrue도 사용 가능
		//컴퓨터가 생각한 숫자를 맞췄을 때 불러올 view
		//숫자를 추측하는 값을 입력하자
		view.displayGuessPrompt();
		int guess = sc.nextInt();
		
		if(model.inCorrectGuess(guess)) {
			view.displayCorrectGuess(); 
			view.displayAttempts(model.getAttempts());
			break;
		} else {
			//틀렸을 때 view
			view.displayIncorrectGuess(); //땡~ 다시 시도하세요^^
			//updown if문 작성하고싶다
			view.displayAttempts(model.getAttempts());
		}
		}
		
	}
	
	public static void main(String[] args) {
		GameModel m = new GameModel();
		GameView v = new GameView();
		GameController c = new GameController(m,v);
		
		c.runGame();
	}
}
