package io.full.soumya.p2;

import java.util.Scanner;

public class Data {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter User Name : ");
		String name=scn.nextLine();
		System.out.println("Enter Password : ");
		String pwd=scn.nextLine();
		System.out.println("Enter Your Data : ");
		String data=scn.nextLine();
		
		String opt;
		System.out.println("Do you want to see your Data ?(Yes/No)");
		 opt = scn.nextLine();
		 if(opt.equalsIgnoreCase("Yes")) {
		 System.out.println("Please Enter user Name : ");
		 String name1=scn.nextLine();
		 System.out.println("Please Enter Password Name : ");
		 String pwd1=scn.nextLine();
		 
		  if(name1.equals(name)) {
			  if(pwd1.equals(pwd)) {
				  System.out.println("Your Data is : "+data);
			  }
			  
		  }
		  else {
			  System.out.println("===Invalid Credentials : Please Enter valid user name and password=== ");
		  }
		
		 }
		 
		 if(opt.equalsIgnoreCase("No")) {
			 System.out.println(" ===//\\--//\\--Thank You For Your Cooperation --//\\--//\\===");
		 }

	}


}
