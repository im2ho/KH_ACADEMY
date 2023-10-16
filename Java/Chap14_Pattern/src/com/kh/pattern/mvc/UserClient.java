package com.kh.pattern.mvc;

import com.kh.pattern.mvc.Model.UserModel;
import com.kh.pattern.mvc.View.UserView;
import com.kh.pattern.mvc.controller.UserController;

public class UserClient {
	//MVC 패턴을 사용해서 학생정보를 다루는 곳 > 단순히 정보를 보는 곳 (MVC패턴에 포함 X)
	
	//모델 객체 생성
	UserModel user = new UserModel("홍길동",20);
	
	//View 객체 생성
	UserView view = new UserView();
	
	//Controller 객체 생성
	UserController controller = new UserController(user, view);
	
	public static void main(String[] args) {
		//클라이언트 : 단순 출력 용도
	}

}
