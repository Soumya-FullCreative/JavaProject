package com.nt.sp;

import java.util.Scanner;

public class ReverseName {

	public static void main(String[] args) {
		String name;
		String rev="";
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter name ");
		name=scn.nextLine();
		int len=name.length();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		
		System.out.println("reverse of " +name+ " is " +rev);
		

	}

}
