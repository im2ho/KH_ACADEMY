package com.kh.calculatorMVC;

public class CalculatorMain { //Client

	public static void main(String[] args) {
		// model view controller 넣어주기
		// model 객체 생성
		CalculatorModel model = new CalculatorModel();
		// view 객체 생성
		CalculatorView view = new CalculatorView();
		// Controller 객체 생성
		CalculatorController controller = new CalculatorController(model, view);
		// ↑ 위에서 적었던 model과 view로 파라미터 작성

	}

}
