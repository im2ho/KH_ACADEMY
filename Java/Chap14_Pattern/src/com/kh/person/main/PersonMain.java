package com.kh.person.main;

import com.kh.person.co.PersonController;
import com.kh.person.mo.PersonModel;
import com.kh.person.vo.PersonView;

public class PersonMain {

	public static void main(String[] args) {
		
		//model
		PersonModel model = new PersonModel("");
		//view
		PersonView view = new PersonView();
		//controller
		PersonController controller = new PersonController(model,view);
		controller.run();

	}

}