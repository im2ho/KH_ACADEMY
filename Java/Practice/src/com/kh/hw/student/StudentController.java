package com.kh.hw.student;

import java.util.Scanner;

public class StudentController {
	
	private StudentModel model;
	private StudentView view;
	
	//������
	public StudentController(StudentModel model, StudentView view) {
		this.model = model;
		this.view = view;
	}
	
	public void runStudent() { //�信 ��û�� �����͸� ������ �Լ�
		
		//�л������� �Է¹ޱ�
		view.displayMessage(); //�л������� �Է��ϼ���
	
		String name = view.displayNameMsg(); //�̸�:
		
		int age = view.displayAgeMsg(); //����:
		
		double height = view.displayHeightMsg(); //Ű:
		
		double weight = view.displayWeightMsg(); //������:
		
		int grade = view.displayGradeMsg(); //�г�:
		
		String major = view.displayMajorMsg(); //����:
		
		model.setName(name);
		model.setAge(age);
		model.setHeight(height);
		model.setWeight(weight);
		model.setGrade(grade);
		model.setMajor(major);
		
		System.out.println("�̸� : " + name + "/ ���� : " + age + "/ Ű : " + height + "/ ������ : " + weight + "/ �г� : " + grade + "/ ���� : " + major);
		
	}
	
}
