package com.nt.sp;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=scn.nextInt();
		int a=-1;
		int b=1;
		int c;
		
		System.out.print("fibonacci is  ");
		for(int i=1;i<=number;i++) {
			for(i=2;i<=number;i++) {
				if(number%i==0)
					break;
			
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
			
			
		}

	}

}
