package com.kh.file_IO;

import java.io.File;

public class File_Delete_Main {
//颇老 昏力
	public static void main(String[] args) {
		String mainPath = "C:\\Users\\user1\\Desktop\\";
		String originFile = mainPath + "cute.png";
		
		//颇老按眉 积己
		File fileToDelete = new File(originFile);
		
		//颇老 昏力
		boolean deleted = fileToDelete.delete();
		if(deleted) {
			System.out.println("颇老昏力己傍");
		} else {
			System.out.println("颇老昏力角菩");
		}
	}

}