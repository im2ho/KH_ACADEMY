package com.kh.iAddress_Practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PracticeAddress {

	public static void main(String[] args) {
		
		PracticeAddress pa = new PracticeAddress();
		pa.InetPractice();
	}
	
	public void InetPractice() {
		
		try {
			InetAddress address = InetAddress.getByName("www.google.co.kr");
			byte[] ipAddress = address.getAddress();
			System.out.print("IP Address를 byte로 얻기 : ");
			for(byte ip : ipAddress) {
				System.out.print(ip + ".");
				
			// 호스트 이름 얻기
			String hostName = address.getHostName();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
