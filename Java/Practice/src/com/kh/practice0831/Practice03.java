package com.kh.practice0831;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		// ����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���.....
		// ��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
		
		Scanner sc = new Scanner(System.in);
		
			
		System.out.print("�ڿ��� �� ���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if (num < 1) {
			System.out.print("1 �̻��� ���ڸ� �Է����ּ���");
			
		} else { // 1�̻��� ���ڵ�(�ڿ���)
			for(int i=num ; i>=1 ;i-- ) { //�Ųٷ� ���ڰ� ��µǰ� �ϱ�
				System.out.print(i + " ");
			}
		}
		
		
		
		
		
		
	}

}
