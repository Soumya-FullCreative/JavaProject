package com.nt.sp;

import java.util.Scanner;

public class Synoriq4 {

	public static void main(String[] args) {
		int [] arr= {234,249,285,242,295,303};
		int oddCount=0;
		int evenCount=0;
		int oddFine=0;
		int evenFine=0;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a Number : ");
		int Number=scn.nextInt();
		
		if(Number%2 !=0) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2 !=0) {
					oddCount++;
					oddFine=oddCount*350;
					System.out.println("Odd Fine : "+oddFine);
				}
				
				
			}
			
		}
		else {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2 ==0) {
			evenCount++;
			evenFine=evenCount*350;
			System.out.println("Even Fine: "+evenFine);
		}
			}
		}
		

	}

}
