package com.kh.practice0831;

import java.util.Scanner;

public class Practice08 {
	public static void main(String[] args) {
		
		//����ڷκ��� �Է� ���� ������ ���� ����ϼ���.
		// 9 �Է� -> 1~9�� �� ��� (9 �ʰ��ϴ� �� ������ 9 ������ ���ڸ� �Է����ּ��� ���)
		//������ ���� Ǯ��..
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num>9) {
			System.out.print("9 ������ ���ڸ� �Է����ּ���");
		} else {
			for(int i=1;i<=9;i++) {
				
				System.out.println("+++++ " + num + " +++++");
				System.out.print(num + " * " + i + " = ");
				System.out.println(num*i);
			}
		}
	}
}
