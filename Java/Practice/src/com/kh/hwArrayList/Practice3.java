package com.kh.hwArrayList;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		/*
		����ڷκ��� 5���� ������ �Է¹޾Ƽ� �迭�� �����Ѵ���,
		���� for ���� ����ؼ� �迭�� ��� ��Ҹ� ���� ��� ���
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 5���� �Է��ϼ��� : ");
		
		int[] numbers = new int[5]; //��ٱ��� ������ֱ�
		
		//�迭�� 5���� ������ �Է��ϴ� for��
		for(int i = 0; i <= 4; i++) {
			System.out.println("���� index[" + (i) + "] : ");
			numbers[i] = sc.nextInt();
			/*
			ArrayList ��� colors.get(0)
			//�迭�� [] �ȿ� ����
			//�ٵ� �迭�� �ڸ��� ����? �迭�� �ڸ� ���� �������߰ڴ�..
			//�ٱ����ٰ� int numbers �̳༮�� �迭�� ����������!
			//for���� �����ϱ� ���� ��ü���� ��ٱ��ϴ� ���������� (line17)
			*/
		}
		
		//�迭�� ��� ��Ҹ� ���� ��� ���
		//������ �������� ���ϴ� ���̱� ������ ���� for�� ���
		//�Ǵ� �⺻ for�� ����ϰ�ʹٸ� length �̿��ؼ��� ��� ����
		
		int sum = 0;
		//	 ���� �� ���� : ��ü����
		for(int number : numbers) {
			sum += number;
		}
		
		//�ջ�� ��� ���
		System.out.println("�迭�� ��� ��Ҹ� ���� ��� : " + sum);
	}

}
