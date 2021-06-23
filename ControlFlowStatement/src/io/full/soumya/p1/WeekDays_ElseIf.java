package io.full.soumya.p1;

import java.util.Scanner;

public class WeekDays_ElseIf {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=scn.nextInt();
		
		int weeks=number/7;
		int rem=number%7;
		int days=rem;
		
		if(number>14) {
			System.out.println(+weeks+ " weeks " +days+ " days");
			
		}
		else if(number>=7 && number<=13){
			 System.out.println(+weeks+" week " +days+ " days ");
			
		}
		else {
			System.out.println(+number+ " days ");
		}
		
		

	}

}
