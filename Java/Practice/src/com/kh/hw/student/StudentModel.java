package com.kh.hw.student;

public class StudentModel {
	//학생의 정보를 이름, 나이, 키, 몸무게, 학년, 전공을 통해 표현
	private String name;
	private int age;
	private double height;
	private double weight;
	private int grade;
	private String major;
	
	public StudentModel() {
		//디폴트생성자
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
