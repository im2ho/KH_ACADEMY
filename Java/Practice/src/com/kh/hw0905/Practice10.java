package com.kh.hw0905;

public class Practice10 {

	public static void main(String[] args) {
		/*
		 �ֹε�Ϲ�ȣ �����ڸ� ���ĺ��� *�� ������ ����ϼ���
		 ��, ���� �迭 ���� ���� ���� �迭 ���纻���� �����ϼ���?
		 */
		
		//1. �ֹι�ȣ �����
		String addressNum = "123456-7890123"; //14�ڸ� (���(-) ����)
		
		//2. �����ڸ� ���� ��ǥ ����°� �����
		String makeStar = "*";
		//to char Array�� ����ؼ� String -> char Array�� ����
		
		char[] numStar = addressNum.toCharArray();
		//{'1','2','3','4','5','6','-','7','8','9','0','1','2','3'}
		
		//for(�ֹι�ȣ 9��° �ڸ�~���ڸ����� '*' ó�� �ϱ�)
		for(int i = 8; i <= (numStar.length - 1) ; i++) { //numStar.length=14
			numStar[i] = '*';
		}
		
		System.out.println(numStar); //for���� ���� i�� ��� �Ұ�

	}

}