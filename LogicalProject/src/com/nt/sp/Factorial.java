package com.nt.sp;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=scn.nextInt();
		int fact=1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial number is  "+fact);


	}

}
