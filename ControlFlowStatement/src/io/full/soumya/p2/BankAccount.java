package io.full.soumya.p2;

public class BankAccount {
	private static String bankName;
	private static String branchName;
	private static String ifsc;
	private long accNum;
	private String accHName;
	private static double balance;
	
	public static void setBankDetails(String a,String b,String c) {
		bankName=a;
		branchName=b;
		ifsc=c;
		
	}
	public void setAccountDetails(long x,String y,double z) {
		accNum=x;
		accHName=y;
		balance=z;
	}
	public double deposit(double amount) {
		balance=balance+amount;
		return balance;
		
	}
	public double withdraw(double amount) {
		balance=balance-amount;
		return balance;
	}
	public void currentBalance() {
		System.out.println(balance);
	}
	public void ifsc() {
		System.out.println(ifsc);
	}
	public static String getBankName() {
		return bankName;
	}
	
	public void display() {
		System.out.println("Bank name: "+bankName);
		System.out.println("Branch name: "+branchName);
		System.out.println("Ifsc code: "+ifsc);
		System.out.println("Account no : "+accNum);
		System.out.println("Account holder name: "+accHName);
		System.out.println("Account balance: "+balance);
	}

}
