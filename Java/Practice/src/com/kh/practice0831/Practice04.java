package com.kh.practice0831;

import java.util.Scanner;

public class Practice04 {
	
	public static void main(String[] args) {
		// Practice03 + �ٸ� �Է°��� ���� ������ �ݺ��ϱ� �߰�
		
		Scanner sc = new Scanner(System.in);
		
		boolean isPrime = true;
		
		while(isPrime) {
			System.out.print("�ڿ��� �� ���� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			if(num<1) {
				System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���");
				isPrime=true;
			} else {
				for(int i= num ; i>=1 ;i-- ) { //for�� ���θ� �ϼ��ϼ���
					System.out.print(i + " ");
				}
				isPrime = false;
			}
		}
		
		
		}
		
	}
