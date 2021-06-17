package io.full.soumya.model;

public class BankAccount {
	//static fields
	private static String bankName;
	private static String branchName;
	private static String ifsc;
	
	//instance variable
	private long accNo;
	private String accHolderName;
	private double balance;
	private Customer customer;
	
	//initializing static fields
	static {
		bankName="SBI";
		branchName="Pattamundai";
		ifsc="SBIN0002100";
	}

	//constructor initializing the value of bank object
	public BankAccount(long accNo, String accHolderName, double balance, Customer customer) {
		
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.balance = balance;
		this.customer = customer;
	}

	//setter and getter method
	
	public static String getBankName() {
		return bankName;
	}

	

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public static void setBankName(String bankName) {
		BankAccount.bankName = bankName;
	}

	public static String getBranchName() {
		return branchName;
	}

	public static void setBranchName(String branchName) {
		BankAccount.branchName = branchName;
	}

	public static String getIfsc() {
		return ifsc;
	}

	public static void setIfsc(String ifsc) {
		BankAccount.ifsc = ifsc;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public void display() {
		System.out.println("Bank Name: "+bankName);
		System.out.println("Branch Name: "+branchName);
		System.out.println("Ifsc :"+ifsc);
		System.out.println("Account holder name :"+accHolderName);
		System.out.println("Account no: "+accNo);
		System.out.println("Balance :"+balance);
		
	}
	
	

}
