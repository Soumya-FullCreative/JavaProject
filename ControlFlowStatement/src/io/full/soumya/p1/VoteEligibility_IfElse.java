package io.full.soumya.p1;

import java.util.Scanner;

public class VoteEligibility_IfElse {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter age : ");
		int age=scn.nextInt();
		
		if(age>=18) {
			System.out.println("Person is eligible for voting ");
		}
		else {
			System.out.println("Person is not eligible for voting");
		}
		
	}

}
