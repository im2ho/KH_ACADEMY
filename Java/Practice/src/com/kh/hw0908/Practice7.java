package com.kh.hw0908;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		//����ڿ��� ���� ũ�⸦ �ް�
		Scanner sc = new Scanner(System.in);
		int numRows = sc.nextInt();
		sc.nextLine(); //���๮�� ����
		
		int[][] charArray = new int[numRows][];
		
		//�� ����ŭ�� �ݺ��� ����
		for(int i=0 ; i <numRows ; i++) {
			//���� ũ�⵵ �޾�
			System.out.println(i + "���� ũ�� �ޱ� : ");
			int numCols = sc.nextInt();
			
			charArray[i] = new int[numCols];
			
			int StartValue = i * numCols + 1;
			for(int j = 0 ; j <numCols ; j ++) {
				charArray[i][j] = StartValue++ ;
			}

		}
		
		//������ ���� �迭�� ���� �� �Ҵ�
		//�� �ε����� 'a'���� �� �ε����� ������ŭ �ϳ��� ���� �����ϰ�
		//����ϼ���
		//�迭 ���
		for(int i=0 ; i < numRows ; i++) {
			for(int j=0 ; j<charArray[i].length ; j++) {
				System.out.println((char)('a'+charArray[i][j]-1));
			}
			System.out.println(charArray); //?
		}

	}

}