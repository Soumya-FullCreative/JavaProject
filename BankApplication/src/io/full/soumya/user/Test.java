package io.full.soumya.user;

import java.util.Scanner;

import io.full.soumya.dao.Bank;
import io.full.soumya.model.BankAccount;

public class Test {
	

	public static void main(String[] args)throws InterruptedException{
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		  String exit;
	    
		Bank bank=new Bank();
		loop:while(true) {
			welcome();
		int	option = scn.nextInt(); scn.nextLine();
		  switch(option){//open account
		 case 1: {
			 bank.openAccount();
			Thread.sleep(3000);
			 
			 break;
		 }
		 case 2 :{//Deposit
			 bank.deposit();
			 Thread.sleep(3000);
			 break;
		 }
		 case 3:{//withdraw
			 
			bank.withdraw();
			Thread.sleep(3000);
			break;
		 }
	
		 case 4:{ //Exit 
			  System.out.println("    _/\\_ _/\\_ _/\\_ Thank you , Visit Again _/\\_ _/\\_ _/\\_");
			  System.exit(0);
			  }
		
		 
			  default:
			  System.out.println("Invalid option");
			  break;
			  }
	//	System.out.println("Do you want to perform more operation ?Y/N:");
	//	scn.nextLine();
	//	exit=scn.nextLine();
	/*	if(exit.equalsIgnoreCase("y")) {
			welcome();
		}
		else {
		   System.out.println("Thank you bye... ");
		} */
		}
		       
			 
		 }
	static void welcome() {
		  System.out.println("Welcome to State Bank");
		  System.out.println("1.Create Account");
		  System.out.println("2.Deposit");
		  System.out.println("3.Withdraw");
		  System.out.println("4.Exit");
		 
		  System.out.println("Enter a option");
		}

	}


