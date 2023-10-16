package com.kh.SocketMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 1. ServerMain 실행 후
 2. CMD 통해서 SocketMain 폴더까지 들어온 후
 3. java ClientMain.java > Enter > 콘솔창에 "클라이언트가 연결되었습니다" 출력됨
*/

public class ClientMain {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// 서버에 연결하기 위한 소켓 생성
		Socket socket = new Socket("localhost",12345); //throw
		
		// 서버로 데이터를 보내기 위한 출력 스트림 생성
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		
		// 서버로부터 데이터를 받기 위한 출력 스트림 생성
		BufferedReader in = new BufferedReader((new InputStreamReader(System.in)));
		
		// 키보드로부터 입력 받기 위한 생성
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		String userInputString;
		while((userInputString = userInput.readLine())!= null) {
			// 사용자 입력을 서버로 전송하겠습니다
			out.println(userInputString);
			
			// 서버로부터 받은 응답 출력
			String serverResponse = in.readLine();
			System.out.println("서버의 응답 : " + serverResponse);
		}
		
		// 소켓 및 입력 스트림 닫기
		socket.close();
		userInput.close();
	}
}