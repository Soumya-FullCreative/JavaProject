package io.full.encapsulation.p18;

public class BankAccount {
	private double balance;

	public void setBalance(double balance) {
		if(balance<=0) {
			System.out.println("Do not enter -ve/zero amount");
			this.balance=balance;
			
		}
		else {
			System.out.println("Your balance is successfully stored");
			this.balance=balance;
		}
	}

	public double getBalance() {
		
		return balance;
	}

	

}
