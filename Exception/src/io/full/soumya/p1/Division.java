package io.full.soumya.p1;

import java.io.*;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

		void div() {
			try {
				Scanner scn=new Scanner(System.in);
				int a;
				int b;
				while(true) {
					try {
						System.out.println("Enter first no : ");
						a=scn.nextInt();
						break;
						
					}
					
					catch(NumberFormatException nfe) {
						System.out.println("Wrong input :Enter only number");
					}
					
				}
				while(true) {
					try {
						System.out.println("Enter second no : ");
						b=scn.nextInt();
						try {
							int c=a/b;
							System.out.println("Result : "+c);
						}
						catch(ArithmeticException ae) {
							System.out.println("Wrong input : Donot pass zero");
							continue;
						}
						break;
					}
					catch(NumberFormatException nfe) {
						System.out.println("Wrong input :Enter only number");
					}
				}
			}
			
			catch(InputMismatchException ie) {
				System.out.println("Enter no only");
				
			}
			
		}
	
	
}
