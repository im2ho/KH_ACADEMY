package com.kh.hw.student;

public class StudentModel {
	//�л��� ������ �̸�, ����, Ű, ������, �г�, ������ ���� ǥ��
	private String name;
	private int age;
	private double height;
	private double weight;
	private int grade;
	private String major;
	
	public StudentModel() {
		//����Ʈ������
	}
	
	//Getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public int getGrade() {
		return grade;
	}
	public String getMajor() {
		return major;
	}
	
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
	
	
}
