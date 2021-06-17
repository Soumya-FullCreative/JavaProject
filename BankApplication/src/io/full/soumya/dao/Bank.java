package io.full.soumya.dao;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import io.full.soumya.model.BankAccount;
import io.full.soumya.model.Customer;

public class Bank {
	Scanner scn=new Scanner(System.in);
	
	//BankAccount[] object used for specific customer
	static BankAccount[] bankAccountList;
	
	//counting number of customer need to create ,technically count size of array
	static int count;
	//used in all methods and operations, customer unique account no  
	static long accNo;
	
	
	
	
	public void openAccount() {
		count++;
		if(count==1) {
			bankAccountList=new BankAccount[1];
		}
		else {
			BankAccount[] updatedAccountList=new BankAccount[bankAccountList.length+1];
			for(int i=0;i<bankAccountList.length;i++) {
				updatedAccountList[i]=bankAccountList[i];
			}
			bankAccountList=updatedAccountList;
		}
		//starting each object values at next location of bankaccount
		int index=bankAccountList.length-1;
		
		try {
			Customer customer=new Customer();
			
			System.out.println("Enter your Name:");
			customer.setName(scn.nextLine());
			System.out.println("Village name");
			customer.setVillageName(scn.nextLine());
			System.out.println("Pincode");
			customer.setPinCode(scn.nextInt());scn.nextLine();
			System.out.println("Police Station: ");
			customer.setPs(scn.nextLine());
			System.out.println("AAdhaar No : ");
			customer.setAadhaarNum(scn.nextLong());
			
			System.out.println("=============");
			BankAccount bankAccount=new BankAccount(generateRandomDigits(), customer.getName(), 1000, customer);
			bankAccountList[index]=bankAccount;
			bankAccount.display();
			System.out.println("==============");
			customer.displayAllDetails();
			System.out.println("==============");
			scn.nextLine();
			System.out.println("Account created successfully");
			
		}catch(InputMismatchException e) {
			System.out.println("wrong input entered");
		}
	}
	
	//generate random digits for account number
	public static int generateRandomDigits() {
		int m=(int)Math.pow(10,10+1);
		return m+new Random().nextInt();
	}
	
	public void deposit() {
		System.out.println("Enter your account no: ");
		 accNo = scn.nextLong();
		
		System.out.println("Enter amount: ");
		double amount = scn.nextDouble();
		
		if(amount<=0) {
			System.out.println("deposite amount must be greter than zero");
		}
		else {
			BankAccount bankAccount=findBankAccount(accNo);
		   if(hasAccount(accNo)) {
			   if(bankAccount.getAccNo()==accNo) {
				   bankAccount.setBalance(bankAccount.getBalance()+amount);
				   System.out.println("--------------");
				   bankAccount.display();
				   System.out.println("Amount deposited sucessfully");
			   }
		   }
		   else
			   System.out.println("Invalid account number given");
		   
		}
	}
	
	

	public void withdraw() {
		System.out.println("Enter Account number :");
		accNo=scn.nextLong();
		
		System.out.println("How much you want to withdraw: ");
		double withAmount=scn.nextDouble();
		
		if(withAmount<=0 ) {
			System.out.println("Withdraw amount must be >0");
		}
		else {
			BankAccount bankAccount=findBankAccount(accNo);
			
			if(hasAccount(accNo)) {
				if(bankAccount.getAccNo()==accNo) {
					if(bankAccount.getBalance()- withAmount < 0) {
						System.out.println("you have insufficient fund");
					}
					else {
						bankAccount.setBalance(bankAccount.getBalance()-withAmount);
						System.out.println("Amount sucessfully debited");
						System.out.println("Available balance : "+bankAccount.getBalance());
					}
					
				}
				else {
					System.out.println("invalid acc no");
				}
			}
		}
	}
	
	private BankAccount findBankAccount(long accNo) {
		BankAccount bankAccount;
		for(int i=0;i<bankAccountList.length;i++) {
			bankAccount=bankAccountList[i]; 
			if(bankAccount.getAccNo() == accNo)
				return bankAccount;
		}
		return null; 
	}
	
	public boolean hasAccount(long accNo) {
		BankAccount bankAccount=findBankAccount(accNo);
		if(bankAccount != null) {
			if(bankAccount.getAccNo()==accNo) {
				return true;
			}
			
		}
		return false;
	}

}
