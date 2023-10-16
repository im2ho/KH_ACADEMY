package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class File_IOMain {
	
	public static void main(String[] args) {
		
		try {
			// 파일생성									//두 번째 인자의 값이 true로 지정되면 해당 파일에 이어쓰기가 됨
			FileWriter fw = new FileWriter("Pokedex.txt",true);
			
			// 파일 안에 내용 쓰기
			// int 값을 어케쓰지 ?
			fw.write("가디 윈디\n");
			fw.write("야차모 번치코\n");
			fw.write("브케인 블레이범\n");
			fw.write("파이리 리자몽\n");
			
			FileReader reader = new FileReader("Pokedex.txt");
			// 버퍼를 통해..
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String line;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			
			bufferedReader.close();
			
			fw.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}