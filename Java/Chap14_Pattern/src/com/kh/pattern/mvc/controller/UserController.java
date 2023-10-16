package com.kh.pattern.mvc.controller;

import com.kh.pattern.mvc.Model.UserModel;
import com.kh.pattern.mvc.View.UserView;

public class UserController { 
	// Model과 View를 연결하는 곳
	// 사용자 입력을 처리하는 곳
	
	private UserModel usermodel;
	private UserView userview;

	public void setModel(UserModel usermodel) {
		this.usermodel = usermodel;
	}
	
	public void setView(UserView userview) {
		this.userview = userview;
	}
	
	public UserModel getModel() {
		return usermodel;
	}
	
	public UserView getView() {
		return userview;
	}
	


	//컨트롤러 객체 생성 및 모델 뷰 설정
	public UserController(UserModel usermodel, UserView userview) {
		this.usermodel = usermodel; //모델 가져오기
		this.userview = userview; //보는거 가져오기
	}

}
