package com.nt.sp;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=scn.nextInt();
        int temp=number;
        int num=0;
        int rem;
        
        while(temp!=0) {
        	rem=temp%10;
        	num=num+rem*rem*rem;
        	temp=temp/10;
        }
        	
        	if(number==num)
        		System.out.println(number+  " is a Armstrong  number");
        	else
        		System.out.println(number+  " is not a armstrong  number");
	}

}
