package com.kh.practice0831;

import java.util.Scanner;

public class Practice22_Hard {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//�簢�� ��� (1,5�� �� 1,5�� ���)
		
		int num = sc.nextInt();
	
		for(int i = 1 ; i <= num ; i++) { //���� ��Ÿ���� i
	
			for(int j = 1 ; j<=5 ; j++) { //���� ��Ÿ���� j
				if(i == 1 || i == num || j == 1 || j == num) { //���� 1�� ���� ������ �࿡�� *�� ����, ���� 1�� ���� ������ ������ *�� ����
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
		
			}
			
		}
		System.out.println();
	}

}
//����for�� ����: �޸� ����� ŭ..
