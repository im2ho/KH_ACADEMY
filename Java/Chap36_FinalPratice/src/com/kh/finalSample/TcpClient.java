package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	// 실행하기 위한 출력 메서드
	public static void main(String[] args) throws UnknownHostException{
	
	// 서버주소와 포트 번호로 소켓 생성..
	// 서버주소와 포트번호 .. 내가 연결하고자 하는 포트와 동일
	int port = 3333;
	String serverIP;
	serverIP = InetAddress.getLocalHost().getHostAddress();
	System.out.println(serverIP);
	
	try {
		Socket socket = new Socket(serverIP, port);
		System.out.println("server connect");
		
		//클라이언트와 통신을 위한 입출력 스트림 설정
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		OutputStream out = socket.getOutputStream(); //BufferedReader로 읽어온 것을 OutputStream을 통해 서버로 출력하기(화면출력X)
		// ex) 동영상 스트리밍하는데 버퍼링이 오진다... (버퍼링 : 동영상 데이터를 읽어오고 > 스트리밍으로 영상 출력)
		
		//추가적 메시지
		//클라이언트에서 서버로 메시지 전송
		String msg = "Hi Serverrr";
		out.write(msg.getBytes());
		out.flush();
		
		//socket.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}
	
}