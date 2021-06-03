package com.nt.sp;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=scn.nextInt();
		int rev=0;
		int rem;
		
		while(number!=0) {
			rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		
		System.out.println("The reverse no is  "+rev);
		
		
	}

}
