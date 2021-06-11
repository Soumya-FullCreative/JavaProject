package io.full.soumya.p1;

public class BankAccount {
	static String bankName;
	static String branchName;
	static String ifsc;
	long accNum;
	String accHname;
	double balance;
	
	static void warning() {
		
		System.out.println("your account must have minimum  Rs-2000 ...");
		
	}
	
	void deposit() {
		double amount= balance+5000;
		System.out.println(amount);
	}
	
	
	public static void main(String[] args) {
		BankAccount.bankName="SBI";
		BankAccount.branchName="Pattamundai";
		BankAccount.ifsc="SBIN0002100";
		
		BankAccount ba1;
		ba1=new BankAccount();
		ba1.accNum=4852751231L;
		ba1.accHname="Soumya Ranjan";
		ba1.balance=500000.00;
		
		System.out.println(bankName);
		System.out.println(branchName);
		System.out.println(ifsc);
		System.out.println(ba1.accNum);
		System.out.println(ba1.accHname);
		System.out.println(ba1.balance);
		
		System.out.println();
		ba1.deposit();
		warning();
		
		
	}

	
	

}
