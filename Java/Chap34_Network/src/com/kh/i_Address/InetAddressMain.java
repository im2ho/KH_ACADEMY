package com.kh.i_Address;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {
	
	public static void main(String[] args) {
		
		InetAddressMain ia = new InetAddressMain();
		//ia.InetExample();
		ia.InetSample();
	}
	
	public void InetExample() {
		
		try {
			// 호스트 이름 이용해서 객체 생성 (남의 정보 가져오기)
			InetAddress address = InetAddress.getByName("github.com"); //.getByName > trycatch
			
			// ip주소 출력
			System.out.println("Host Name : " + address.getHostName());
			System.out.println("IP Address : " + address.getHostAddress()); //.getAddress는 뭘까..
		
			// 현재 호스트의 InetAddress 객체 얻기 (내가사용하는컴퓨터의 InetAddress 객체 얻기)
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host Name : " + localHost.getHostName());
			System.out.println("Local IP Address : " + localHost.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
	
	public void InetSample() {
		
		try {
			// 호스트 이름을 가져와서 객체 생성
			InetAddress address = InetAddress.getByName("www.naver.com");
			
			// IP주소를 byte 배열로 얻기
			// InetAddress 객체에서 IP 주소를 바이트 배열로 얻음
			// IP 주소를 바이트 배열로 얻으면 각 바이트를 통해 IP 주소를 다룰 수 있음
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Address를 byte로 얻음");
			for(byte ip : ipAddress) {
				System.out.print(ip + ".");
			}
			
			System.out.println(); //줄바꿈
			
			// 도메인 명에 지정된 모든 호스트의 IP 주소를 배열로 얻기
			InetAddress[] alladdress = InetAddress.getAllByName("www.google.co.kr");
			System.out.println("구글에 지정된 모든 호스트의 아이피 주소를 배열로 얻음");
			for(InetAddress arrs : alladdress) {
				System.out.println(arrs.getHostAddress());
			
			// 호스트 이름 얻기 (호스트 : 네트워크에 연결되어잇는...컴퓨터)
			String hostName = address.getHostName();
			System.out.println("Host Name : " + hostName);
			
			// 지역 호스트의 IP 주소 얻기
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host address : " + localHost.getHostAddress());
			
			// 멀티 캐스트 주소 여부 확인
			boolean isMultiCast = address.isMulticastAddress();
			System.out.println("멀티 캐스트 주소입니까? " + isMultiCast);
			
			// 호스트 이름을 이용해서 InetAddress 객체 생성
			InetAddress name = InetAddress.getByName("www.daum.net");
			System.out.println("IP 주소 이름 : " + name.getHostAddress());
			
			// 호스트의 완전한 이름 가져오기 (전체 도메인 이름)
			// 호스트의 정규화된(FQDN) 도메인의 이름을 얻음
			// FQDN : Full Qualified Domain Name
			String hostFullName = address.getCanonicalHostName();
			System.out.println("풀네임 : " + hostFullName);
			
			// LoopBack 주소 여부 확인
			boolean isLoopBack = address.isLoopbackAddress();
			System.out.println("루프백인가요.. : " + isLoopBack);
			
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
				
	}

}