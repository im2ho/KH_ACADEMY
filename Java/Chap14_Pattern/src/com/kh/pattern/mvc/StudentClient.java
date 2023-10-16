package com.kh.pattern.mvc;

import com.kh.pattern.mvc.Model.StudentModel; 
import com.kh.pattern.mvc.View.StudentView;
import com.kh.pattern.mvc.controller.StudentController;

public class StudentClient {
	
	// MVC 패턴을 사용해서 학생정보를 다루는 곳

	public static void main(String[] args) {
		// model 객체 생성
		StudentModel model = new StudentModel("나쭌이",13);
		// view 객체 생성
		StudentView view = new StudentView();
		// controller 객체 생성 (model, view 설정)
		StudentController controller = new StudentController(model,view);
		// 학생 정보를 업데이트해서 출력
		controller.updateView();
		// 학생 정보를 업데이트 하자~
		controller.setstudentName("이름업데이트");
		controller.setstudentAge(18);
		// 업데이트 된 학생 정보를 출력하자~
		controller.updateView();

	}
}

