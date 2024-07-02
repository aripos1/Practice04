package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {

		int[] numArr01 = new int[6];
		

		for (int i = 0; i < numArr01.length; i++) {
			numArr01[i] = (int) (Math.random() * 45) + 1;

			for (int a = 0; a < i; a++) {
				 int newNum;

				if (numArr01[i] == numArr01[a]) {
					break;
				}
				
			}
			System.out.println(numArr01[i]);
			
		}

	}

}