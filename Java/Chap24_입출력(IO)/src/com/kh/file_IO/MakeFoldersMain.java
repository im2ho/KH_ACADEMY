package com.kh.file_IO;

import java.io.File;

public class MakeFoldersMain {
/*
 mkdirs
 	바탕화면 > kh > image 생성을 하고싶은데.. kh가 없다~!
 	> 부모 디렉토리가 존재하지 않는 경우에 중간 모든 디렉토리 생성
 */
	public static void main(String[] args) {
																  //폴더이름이 'HG'인 폴더 생성
		String dirPath = "C:\\Users\\user1\\Desktop\\Pokemon\\HGSS\\HG";

		//file 객체 생성
		File dir = new File(dirPath);
		
		//mkdirs 메서드를 사용하여 디렉토리 생성 시도
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("폴더 생성 성공!");
		} else {
			System.out.println("폴더 생성 실패 ㅠ");
		}
		
		// ↑ 실행하면 dirPath에서 지정한 디렉토리 파일이 다 생긴다 (Pokemon, HGSS, HG까지 총 3개 폴더)
	}

}
