package com.kh.practice0831;

import java.util.Scanner;

public class Practice22_Hard {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//사각형 출력 (1,5행 및 1,5열 찍기)
		
		int num = sc.nextInt();
	
		for(int i = 1 ; i <= num ; i++) { //행을 나타내는 i
	
			for(int j = 1 ; j<=5 ; j++) { //열을 나타내는 j
				if(i == 1 || i == num || j == 1 || j == num) { //행이 1일 경우와 마지막 행에서 *을 찍자, 열이 1일 경우와 마지막 열에서 *을 찍자
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
		
			}
			
		}
		System.out.println();
	}

}
//이중for문 단점: 메모리 사용이 큼..
