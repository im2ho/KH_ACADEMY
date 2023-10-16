package com.kh.file_IO;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImgResizeMain {

	public static void main(String[] args) {
		// 원본 이미지 파일 경로 설정하고 이미지 리사이즈한 파일 경로 설정
		String path  = "C:\\Users\\user1\\Desktop\\"; //바탕화면 경로: cmd창 켜고, cd + Desktop 입력해서 나오는 링크
		String inputImg = path + "Windy.jpg";
		String outputImg = path + "reSizeWindy.jpg"; //이름을 같게하면 원본이 덮어쓰기로 저장된다
		
		//리사이즈할 이미지 크기 설정
		int width = 2000; //가로길이
		int height = 100; //세로길이 찌부시켜야지
		
		//원본 이미지를 읽어오기
		try {
			BufferedImage originImg = ImageIO.read(new File(inputImg)); //Buffer:파일을 읽어오는 것 ex)동영상 버퍼링이 심하다
			
			//새로운 크기로 이미지를 리사이즈
			Image resizeImg = originImg.getScaledInstance(width, height, Image.SCALE_SMOOTH); //스무스하게...해보궛어요?
			//originImg.getGraphics().drawImage(originImg, height, height, height, height, height, height, width, height, null);
			
			//BufferedImage로 변환
			BufferedImage bufResizeImg = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB); //버퍼드이미지의 인스턴스 만들기
			
			//리사이즈 요청한 사이즈로 새로 그려줘 drawImage
			bufResizeImg.getGraphics().drawImage(resizeImg,0,0,null);
			
			//리사이즈 된 이미지를 파일로 저장
			ImageIO.write(bufResizeImg, "jpg"/*.jpg로도 저장가능?*/, new File(outputImg));
			
			System.out.println("이미지 리사이즈 완료 ~.~");
		} catch (Exception e) { //Exception: 모든 예외처리의 조상님
			// TODO Auto-generated catch block
			System.out.printf("이미지 리사이즈 중 오류 발생 : " + e.getMessage());
		}
	}

}
