package com.kh.practice0831;

import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {
		/*
		 ����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			for(;num2<=num1;num2++) {
				System.out.print(num2 + " ");
				}
			} else {
				for(;num1<=num2;num1++) {
					System.out.print(num1 + " ");
				}
			}
		
	}
	
//restart �� reEnd.....��� ���� ���� �����ϴ� ����� �ִ�... (�ٵ� �̰� �� ����..)

	/**
 	���2. Math: �ڹ� ���� Ŭ����
	- min(���� ���� ��): �־��� �� ���� ���� �߿��� �� ���� ���� ��ȯ
	- max(���� ū ��): �־��� �� ���� ���� �߿��� �� ū ���� ��ȯ
	 **/

	/*
	 �ڵ�� ������ ����� ����
	 */

}