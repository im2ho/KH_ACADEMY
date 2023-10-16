package com.kh.practice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
//import javax.print.DocFlavor.STRING;

public class PracticeResize {

	public static void main(String[] args) {
		// 이미지 하나 불러오기
		// 바탕화면에 새로운 폴더 만들기 mkdir
		// 새로 리사이즈한 이미지 바탕화면에 새로 만든 폴더 안에 저장하기
		
		String path = "C:\\Users\\user1\\Desktop\\";
		String inputImg = path + "Windy.jpg";
		
		//아웃풋 이미지 저장할 폴더 생성
		String dirPath = "C:\\Users\\user1\\Desktop\\HeartGold";
		File dir = new File(dirPath);
		boolean success = dir.mkdir();
		
		if(success) {
			System.out.println("폴더생성완료");
		} else {
			System.out.println("폴더생성실패");
		}
		
		//아웃풋 파일 새로만든 폴더에 생성
		String outputImg = dirPath + "\\reSizeWindy.jpg";
		
		int width = 100;
		int height = 100;
		
		try {
			BufferedImage originImg = ImageIO.read(new File(inputImg));
			
			Image resizeImg = originImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			
			BufferedImage bufResizeImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			
			bufResizeImg.getGraphics().drawImage(resizeImg,0,0,null);
			
			ImageIO.write(bufResizeImg, "jpg", new File(outputImg));
			
			System.out.println("완료완료");
			
		} catch (Exception e) {
			System.out.println("오류 : " + e.getMessage());
		}

	}

}
