package com.kh.hw.student;

import java.util.Scanner;

public class StudentView { 
	
	//�л� ���� �ֱ�
	
	Scanner sc = new Scanner(System.in);
	
	public void displayMessage() {//���ʸ޼���
		System.out.println("�л������� �Է��ϼ���");
	}
	
	private String nameMsg = "�̸� : ";
	public String displayNameMsg() {
		System.out.print(nameMsg);
		return sc.next();
	}
	
	private String ageMsg = "���� : ";
	public int displayAgeMsg() {
		System.out.print(ageMsg);
		return sc.nextInt();
	}
	
	private String heightMsg = "Ű : ";
	public double displayHeightMsg() {
		System.out.print(heightMsg);
		return sc.nextDouble();
	}
	
	private String weightMsg = "������ : ";
	public double displayWeightMsg() {
		System.out.print(weightMsg);
		return sc.nextDouble();
	}
	
	private String gradeMsg = "�г� : ";
	public int displayGradeMsg() {
		System.out.print(gradeMsg);
		return sc.nextInt();
	}

	private String majorMsg = "���� : ";
	public String displayMajorMsg() {
		System.out.print(majorMsg);
		return sc.next();
	}

}
