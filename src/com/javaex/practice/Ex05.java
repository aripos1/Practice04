package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		int sum = 0;		
		System.out.println("숫자를 5번 입력하세요");
		
		for (int i=0;i<5;i++ ) {
			num[i] = sc.nextInt();
			sum += num[i];
			
		}
		System.out.println(sum/5);
		sc.close();
	}
}
