package com.kh.circle.co;

import com.kh.circle.mo.CircleModel;
import com.kh.circle.vo.CircleView;

public class CircleMain {

	public static void main(String[] args) {
		// model
		CircleModel model = new CircleModel(); //?
		//view
		CircleView view = new CircleView();
		//controller
		CircleController controller = new CircleController(model,view);
		controller.run(); //controller의 run을 통해 넓이 출력

	}

}