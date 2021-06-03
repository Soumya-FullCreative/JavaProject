package com.nt.sp;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=scn.nextInt();
		
		int temp=number;
		int rev=0;
		int rem;
		
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		
		if(number==rev)
			System.out.println(number+  " is a Palindrome number");
		else
			System.out.println(number+  " is not a Palindrome number");
		

	}

}
