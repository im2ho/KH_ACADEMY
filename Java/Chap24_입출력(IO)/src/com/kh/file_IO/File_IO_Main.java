package com.kh.file_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_IO_Main {
	//FileWriter fWriter = new FileWriter(filePath, true);
	//true: 파일 끝에 이어쓰기, false: 파일 덮어쓰기
	public static void main(String[] args) {
		
		try { //FileWriter통해 trycatch 자동생성
			//파일을 생성하고
			FileWriter writer = new FileWriter("abcde.txt");
			
			//파일 안에 내용 쓰기
			writer.write("파일 덮어써지는지 테스트"); //파일이 계속 덮어써진다

			//파일 안에 내용 다 쓰고 닫기
			writer.close();
			
			//파일 내용 읽어주기
			FileReader reader = new FileReader("abcde.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String line;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line); //버퍼리더 통해 불러온 내용의 라인이 null이 아니면 전부 다 읽어오렴
			}
			
			bufferedReader.close(); //다 읽었으면 닫아! 메모리 누수되니까
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

	/**
	//방법2
	File f = new File("new.txt"); //File import 필요
	//새로운 newFile을 만들고..
	//File f = new File("경로설정","만들고자하는 파일의 이름");
	
	try {
		if(f.createNewFile()) {
			System.out.println("파일이 없어서 만들었습니다..");
		} else {
			System.out.println("파일이 이미 존재합니다..");
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	**/