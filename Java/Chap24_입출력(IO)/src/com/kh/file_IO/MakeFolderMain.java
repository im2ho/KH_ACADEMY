package com.kh.file_IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MakeFolderMain { //mkdir
/*
 파일 = 폴더,
 이미지 jpg png, 텍스트 txt, 비디오 avi mp4 mkr 등등...
 */
	
	public static void main(String[] args) {
		// 폴더를 생성할 경로 지정
		String folderPath = "C:\\Users\\user1\\Desktop\\new_folder"; // "경로\\생성하고자하는 폴더 이름"
		// 폴더 만들기	
		File folder = new File(folderPath);
		//exists : 이미 존재하는지 확인
		if(!folder.exists()) {
			folder.mkdir(); //지정된 경로에 폴더 생성 (make directory)
			System.out.println("폴더가 성공적으로 생성되었습니다");
		} else {
			System.out.println("폴더가 이미 존재합니다");
		}
		
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\new_folder");
			w.write("User 정보를 담는 곳입니다.");
			w.write("Kh 학생");
			w.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
