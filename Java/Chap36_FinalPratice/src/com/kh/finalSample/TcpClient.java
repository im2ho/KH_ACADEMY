package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	// �����ϱ� ���� ��� �޼���
	public static void main(String[] args) throws UnknownHostException{
	
	// �����ּҿ� ��Ʈ ��ȣ�� ���� ����..
	// �����ּҿ� ��Ʈ��ȣ .. ���� �����ϰ��� �ϴ� ��Ʈ�� ����
	int port = 3333;
	String serverIP;
	serverIP = InetAddress.getLocalHost().getHostAddress();
	System.out.println(serverIP);
	
	try {
		Socket socket = new Socket(serverIP, port);
		System.out.println("server connect");
		
		//Ŭ���̾�Ʈ�� ����� ���� ����� ��Ʈ�� ����
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		OutputStream out = socket.getOutputStream(); //BufferedReader�� �о�� ���� OutputStream�� ���� ������ ����ϱ�(ȭ�����X)
		// ex) ������ ��Ʈ�����ϴµ� ���۸��� ������... (���۸� : ������ �����͸� �о���� > ��Ʈ�������� ���� ���)
		
		//�߰��� �޽���
		//Ŭ���̾�Ʈ���� ������ �޽��� ����
		String msg = "Hi Serverrr";
		out.write(msg.getBytes());
		out.flush();
		
		//socket.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}
	
}