package io.full.soumya.p1;

import java.util.Scanner;

public class AboutSal {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter experience:");
		double exp=scn.nextDouble();

		double sal=0;
		String designation=null;

		if(exp<0 || exp>=30){
			System.out.println("this exp is not allowed");
			return;
		}

		if(exp<1){
			designation="fresher";
			sal=15000;
		}
            
        else if((exp>=1)&&(exp<2)){
			designation="associate";
			sal=20000;
		}
         
		 else if((exp>=2)&&(exp<4)){
			 designation="software engineer";
			 sal=30000;
		 }

		 else if((exp==4)){
			 designation="senior s/w engineer";
			 sal=40000;
		 }

		 else{
			 designation="team lead";
			 sal=50000;
		 }

		 double annsal=sal*12;
		 
		System.out.println("exp :"+exp);
		System.out.println("designation :"+designation);
		System.out.println("salary :"+sal);
		System.out.println("annsal :"+annsal);

	}

}
