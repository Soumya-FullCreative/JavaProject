package com.nt.sp;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=scn.nextInt();
		int i;
		
		for(i=2;i<=number;i++) {
			if(number%i==0)
				break;
		}
		
		if(number==i)
			System.out.println(number+  " is a prime  number");
		else
			System.out.println(number+  " is not a prime  number");
  }

}
