package com.kh.practice0831;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		/*
		 �� 1�� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
		 "1 �̻��� ���ڸ� �Է����ּ���"�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		//���� �� ����� boolean ���� = true or false;
		boolean isPrime = false;
		
		while(!isPrime) { //2. ���� �߰��ϱ�
			
			
			System.out.println("�ڿ��� �� ���� �Է��ϼ��� : ");
			int num = sc.nextInt();
				if (num < 1) {
					
						System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
						isPrime=false;
						
					} else { // 1�̻��� ���ڵ�(�ڿ���)
							for(int i = 1 ; i<=num ; i++) {
									System.out.print(i + " ");
								}
							//3. ���� false �����
							isPrime=true;
							}		
				
		
		}

	}

}
