package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {

		int[] numArr = new int[6];
		boolean overlap = true;
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 45) + 1;

			for (int num = 0; num < i; num++) {
				if (numArr[i] == numArr[num]) {
					overlap  = true;
					break;
				}

			}if(overlap =false) {
				i--;
				continue;
			}

			System.out.println(numArr[i]);
		}

	}

}
