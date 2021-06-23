package io.full.soumya.user;

import java.io.IOException;
import java.util.Scanner;

import io.full.soumya.blogic.Bank;
import io.full.soumya.blogic.HDFCBank;
import io.full.soumya.exceptions.InSufficientFundsException;
import io.full.soumya.exceptions.InvalidAmountException;

public class Clerk {

	public static void main(String[] args) throws IOException {
		try {
		Scanner scn=new Scanner(System.in);
		Bank acc1=new HDFCBank();
		String option="";
		do {
			System.out.println("1.Deposite");
			System.out.println("2.Withdraw");
			System.out.println("3.Balance Inquiry");
			System.out.println("Enter option : ");
			option=scn.nextLine();	
			switch(option) {
			case "1":
			{
				System.out.println("Enter deposite amount : ");
				String s=scn.nextLine();
				double amt=Double.parseDouble(s);
				
				acc1.deposite(amt);
				acc1.balanceEnquiry();
				break;
			}
			case "2":
			{
				System.out.println("Enter Withdraw amount : ");
				String s=scn.nextLine();
				double amt=Double.parseDouble(s);
				
				double withDrawAmt=acc1.withdraw(amt);
				System.out.println("Withdraw amount "+withDrawAmt);
				acc1.balanceEnquiry();
				break;
			}
			
			case "3":
			{
				acc1.balanceEnquiry();
				break;
			}
			default:
				System.out.println("Invalid option");
			
			}
			System.out.println("Do you want to continue (Yes/No) : ");
			option=scn.nextLine();
			
			}while(option.equalsIgnoreCase("Yes"));
	}
		catch(InvalidAmountException ie) {
			System.out.println(ie.getMessage());
		}
		catch(InSufficientFundsException isf) {
			System.out.println(isf.getMessage());
		}
		catch(NumberFormatException ne) {
			System.out.println("Please enter only number");
		}
		catch(Exception e) {
			e.printStackTrace();
		}


	}

}
