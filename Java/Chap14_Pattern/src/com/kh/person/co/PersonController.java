package com.kh.person.co;

import com.kh.person.mo.PersonModel;
import com.kh.person.vo.PersonView;

public class PersonController { //사용자 입력을 처리하는 곳
	
	//Model과 View를 연결하기 위해 import
	private PersonModel model;
	private PersonView view;
	
	public PersonController (PersonModel model, PersonView view) {
		this.model = model;
		this.view = view;
	}
	
	public void run() {
		String userInput = view.getUserInput();
		//model.setName(userInput); 이건..뭐하러 쓰는거지
		System.out.println("사람 이름 : " + userInput);
	}

}
