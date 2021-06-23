package io.full.soumya.p2;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args)throws InterruptedException {
		Scanner scn=new Scanner(System.in);
		BankAccount.setBankDetails("SBI","PMI","SBIN0002100");
		
		while(true) {
			System.out.println("welcomr to "+BankAccount.getBankName()+" Bank");
			System.out.println("press enter to continue");
			scn.nextLine();
			
			BankAccount acc=null;
			loop:while(true) {
				System.out.println("\n chose any option");
				System.out.println("1. open account");
				System.out.println("2. Account Details");
				System.out.println("3. Deposit");
				System.out.println("4. Withdraw");
				System.out.println("5.Balance Enquiry");
				System.out.println("6. Exit");
				
				System.out.println("Enter option:");
				int option=scn.nextInt();scn.nextLine();
				
				switch(option) {
				case 1:
					acc=new BankAccount();
				//	System.out.println("Enter account");
					System.out.println("Enter acc no");
					long accNum=scn.nextLong();scn.nextLine();
					System.out.println("Enter Account holder name");
					String accHName=scn.nextLine();
					
					System.out.println("Enter balance");
					double balance=scn.nextDouble();scn.nextLine();
					acc.setAccountDetails(accNum, accHName, balance);
					System.out.println("Account created sucessfully");
					Thread.sleep(3000);
					break;
					
				case 2:
					System.out.println("your account details");
					acc.display();
					Thread.sleep(3000);
					break;
					
				case 3:
					System.out.println("Enter deposit amount");
					double amount= scn.nextDouble();scn.nextLine();
					acc.deposit(amount);
					System.out.println(amount+" is credited inyour account");
					System.out.println("current balance:");
					acc.currentBalance();
					Thread.sleep(3000);
					break;
					
				case 4:
					System.out.println("Enter withdraw amount :");
					amount=scn.nextDouble();scn.nextLine();
					acc.withdraw(amount);
					System.out.println(amount+"is debited in your account");
					System.out.println("current balance:");
					acc.currentBalance();
					Thread.sleep(3000);
					break;
					
				case 5:
					System.out.println("Current balance is :");
					acc.currentBalance();
					Thread.sleep(2000);
					break;
					
				case 6:
					System.out.println(" _/\\_ _/\\_ _/\\_ Thank you , Visit Again _/\\_ _/\\_ _/\\_");
					Thread.sleep(2000);
					break ;
					
				default:
					System.out.println("Invalid option");
					
					
				
					
				}
			}
		}

	}

}
