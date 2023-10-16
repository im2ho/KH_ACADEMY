package com.kh.api.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PracticeMain4 {

	public static void main(String[] args) {
		PracticeMain4 df = new PracticeMain4();
		df.practice1();
		df.practice2();
		df.practice3();
		df.practice4();
		df.practice5();
	}

	public void practice1(){
		//yyyy-MM-dd
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
	}
	
	public void practice2() {
		//HH:mm:ss
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("a HH:mm:ss.SSSSSSSS");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
	}
	
	public void practice3() {
		//MM-dd
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
	}
	
	public void practice4() {
		//yyyy-HH
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-HH");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
	}
	
	public void practice5() {
		//날짜-요일
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E)");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
	}
}
