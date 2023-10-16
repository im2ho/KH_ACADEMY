package com.kh.pattern.mvc;

public class MVC_Student {

	//1. model
	private String name;
	private int age;

	public MVC_Student (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	//2. Controller
	public class SController{
		private MVC_Student model;
		private MVC_Student view;
		
		public SController() {
			this.model = model;
			this.view = view;
		}
		
		public void updateView() {
			view.printInfo();
		}
	}
	
	//1. View
	public void printInfo() {
		System.out.println("학생들의 정보");
	}
	
	//etc. Client	
	public static void main(String[] args) {
		// model
		

	}

}
