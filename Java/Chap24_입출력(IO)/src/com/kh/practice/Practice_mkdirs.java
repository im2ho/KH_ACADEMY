package com.kh.practice;

import java.io.File;

public class Practice_mkdirs {

	public static void main(String[] args) {
		Practice_mkdirs pm = new Practice_mkdirs();
		pm.Practice1(); //바탕화면에 폴더 '이름1, 이름2' 생성
		pm.Practice2(); //JavaWorkspace에 'Chap25, 나, 세희' 생성
		pm.Practice3(); //문서에 파일 5겹 생성
		
	}
	
	public void Practice1() {
		//폴더 연속으로 2개 만들기 C:\\Users\\user1\\Desktop\\이름1\이름2
		
		String dirPath = "C:\\Users\\user1\\Desktop\\이름1\\이름2";
		
		//file 객체 생성
		File dir = new File(dirPath);
		
		//mkdir 메서드 사용해서 디렉터리 생성
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("폴더 생성 성공~");
		} else {
			System.out.println("폴더 생성 실패 ㅠ");
		}
	}
	
	public void Practice2() {
		//폴더 연속으로 3개 만들기 C:\\Users\\user1\\Java_Workspace\Chap25_
	
		String dirPath = "C:\\Users\\user1\\Java_Workspace\\Chap25\\나\\세희";
		
		File dir = new File(dirPath);
		
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("폴더 생성 성공햇어요");
		} else {
			System.out.println("생성 실패요");
		}	
	}
	
	public void Practice3() {
		//폴더 연속으로 5개 만들기 C:\\Users\\user1\\Documents\myPlace\Music\Korean\KPOP\Group
		
		//document부터 5개 file 그룹
		String dirPath = "C:\\Users\\user1\\Documents\\myPlace\\Music\\Korean\\KPOP\\Group";
		
		File dir = new File(dirPath);
		
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("폴더 생성 성공햇어요");
		} else {
			System.out.println("생성 실패요");
		}	
	}

}