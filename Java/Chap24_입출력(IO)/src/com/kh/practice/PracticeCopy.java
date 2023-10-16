package com.kh.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeCopy {
	// 이미지파일 jpg 또는 png 파일을 바탕화면에 저장한 후
	// 바탕화면에다가 폴더를 만들어서
	// 폴더 안에 복사한 이미지 저장하기
	public static void main(String[] args) {
		PracticeCopy pc = new PracticeCopy();
		pc.practice();
	}
	
	public void practice() {
		
		//가져올 파일은?
		String inputFile = "C:\\Users\\user1\\Desktop\\cute.png";
		
		//파일 갖다넣을 폴더 만들기
		String folderPath = "C:\\Users\\user1\\Desktop\\Pokemon";
		File folder = new File(folderPath);
		folder.mkdir();
		
		//저장할 파일은? (위치 및 이름까지 지정)
		String outputFile = "C:\\Users\\user1\\Desktop\\Pokemon\\Realcute.jpg";
		
		try (FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile)){
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while((byteRead = fis.read(buffer))!= -1) {
				fos.write(buffer,0,byteRead);
			}
			
			System.out.println("파일 복사 완료");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
