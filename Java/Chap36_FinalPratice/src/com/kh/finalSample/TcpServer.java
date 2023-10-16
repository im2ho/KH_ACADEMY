package com.kh.finalSample;

import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	// 실행하기 위한 출력 메서드..
	public static void main(String[] args) throws Exception {
		
	// Socket 서버 생성
	int port = 3333;
	ServerSocket server = new ServerSocket(port);
	System.out.println("서버 : 포트 " + port + "에서 접속 중입니다..");
	
	while(true) {
		Socket client = server.accept(); // 클라이언트 연결 대기
		System.out.println("클라이언트 접속 완료 : " + client.getInetAddress()); //누가 접속했는지 출력
		
		//server.close();
		client.close();
	}
	
	}
}
