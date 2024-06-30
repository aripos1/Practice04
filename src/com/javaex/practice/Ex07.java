package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("금액 : ");
	        int money = sc.nextInt();

	        int[] wonArr = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
	        
	        for (int i = 0; i < wonArr.length; i++) {
	            int won = wonArr[i];
	            int num = money/won;
	            money = money -(num*won);
	  	        System.out.println(won+"원 :"+ num +"개");
	      
	        }
	        sc.close();
	    }
}
