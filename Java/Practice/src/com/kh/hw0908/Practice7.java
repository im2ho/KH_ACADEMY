package com.kh.hw0908;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		//사용자에게 행의 크기를 받고
		Scanner sc = new Scanner(System.in);
		int numRows = sc.nextInt();
		sc.nextLine(); //계행문자 제거
		
		int[][] charArray = new int[numRows][];
		
		//그 수만큼의 반복을 통해
		for(int i=0 ; i <numRows ; i++) {
			//열의 크기도 받아
			System.out.println(i + "열의 크기 받기 : ");
			int numCols = sc.nextInt();
			
			charArray[i] = new int[numCols];
			
			int StartValue = i * numCols + 1;
			for(int j = 0 ; j <numCols ; j ++) {
				charArray[i][j] = StartValue++ ;
			}

		}
		
		//문자형 가변 배열을 선엄 및 할당
		//각 인덱스에 'a'부터 총 인덱스의 개수만큼 하나씩 눌려 저장하고
		//출력하세요
		//배열 출력
		for(int i=0 ; i < numRows ; i++) {
			for(int j=0 ; j<charArray[i].length ; j++) {
				System.out.println((char)('a'+charArray[i][j]-1));
			}
			System.out.println(charArray); //?
		}

	}

}