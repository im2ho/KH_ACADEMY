package com.kh.circle.co;

import com.kh.circle.mo.CircleModel;
import com.kh.circle.vo.CircleView;

public class CircleController { //사용자 입력을 처리하는 곳
	
	//Model과 View를 연결하기 위해 import
	private CircleModel model; //모델에서.. 필요한 데이터를 가져옴
	private CircleView view; //가져온 데이터를 뷰에 전달해야함
	
	public CircleController (CircleModel model, CircleView view) {
		this.model = model;
		this.view = view;
	}
	
	public void run() { //뷰에 요청한 데이터를 보여줄 함수
		double userInput = view.getUserInput();
		model.setR(userInput);
		double result = model.calculateArea();
		System.out.println("원의 넓이 : " + result);
	}

}