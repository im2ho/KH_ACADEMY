package com.kh.practice0831;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		
		//1���� ����ڿ��� �Է� ���� �������� �������� ���� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int sum =0 ;
		
		for(int i=1 ;i<=num ;i++ ) {
			
			System.out.print(i + " + ");
			sum = sum + i;
		}
		
		System.out.print("=" + sum );
	}

}
