package com.kh.finalSample;

import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	// �����ϱ� ���� ��� �޼���..
	public static void main(String[] args) throws Exception {
		
	// Socket ���� ����
	int port = 3333;
	ServerSocket server = new ServerSocket(port);
	System.out.println("���� : ��Ʈ " + port + "���� ���� ���Դϴ�..");
	
	while(true) {
		Socket client = server.accept(); // Ŭ���̾�Ʈ ���� ���
		System.out.println("Ŭ���̾�Ʈ ���� �Ϸ� : " + client.getInetAddress()); //���� �����ߴ��� ���
		
		//server.close();
		client.close();
	}
	
	}
}
