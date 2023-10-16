package com.kh.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain r = new PracticeMain();
		r.practice1();
		r.practice2();
	}
	
	public void practice1() { //경로설정해서 파일 만들기
		final String path = "C:\\Users\\user1\\Desktop";
		try {
			//파일을 생성하궛어요
			//C:\\Users\\user1\\Desktop 바탕화면 경로
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\전국도감.txt");
			
			//파일 안에 내용을 써보겟어요
			w.write("이상해씨 이상해풀 이상해꽃\n파이리 리자드 리자몽\n꼬부기 어니부기 거북왕");
			w.close();
			
			//아까 바탕화면에 만들엇으니까.. 경로 + 파일이름으로 불러와야지!
			//절대경로: 어디서 보든지 경로가 확실함
			FileReader reader = new FileReader("C:\\Users\\user1\\Desktop\\전국도감.txt");
			BufferedReader br = new BufferedReader(reader);
			
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			
			br.close();
			
			//파일의 경로 읽고싶은데.. 어케하니
			//System.out.println("파일경로 :" + w.getPath);
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	public void practice2() {
		//폴더를 만들고 폴더 안에 파일을 만들기
		//1.폴더 생성 경로 지정 (바탕화면에 도감이라는 폴더를 만들궛어요)
		String folderPath = "C:\\Users\\user1\\Desktop\\도감";
		//2.폴더 만들기
		File folder = new File(folderPath);
		//3.지정된 위치에 폴더가 이미 존재하는가요?
		if(!folder.exists()) {
			folder.mkdir(); //make directory
			System.out.println("도감 폴더 생성 완료!");
		} else {
			System.out.println("도감이 이미 존재합니다");
		}
		
		
		try {
			//4.생성산 폴더 내 파일만들기
			FileWriter pk = new FileWriter("C:\\Users\\user1\\Desktop\\도감\\전국도감.txt");
			pk.write("오박사의 편지\n");
			pk.write("포켓몬 세상에 온 것을 환영한단다");
			pk.write("");
			pk.close(); //다 썻으면 닫아주세요
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}