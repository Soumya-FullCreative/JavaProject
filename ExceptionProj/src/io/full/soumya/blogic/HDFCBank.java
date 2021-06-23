package io.full.soumya.blogic;

import io.full.soumya.exceptions.InSufficientFundsException;
import io.full.soumya.exceptions.InvalidAmountException;

public class HDFCBank implements Bank{

	private double balance;
	public void deposite(double amt) throws InvalidAmountException {
		if(amt<=0) {
			throw new InvalidAmountException(amt+ "is invalid amount");
		}
		balance=balance+amt;
	}

	
	public double withdraw(double amt) throws InSufficientFundsException {
		if(balance<amt) {
			throw new InSufficientFundsException("Insufficient Funds");
		}
		balance=balance-amt;
		return amt;
	}

	
	public void balanceEnquiry() {
		System.out.println("Current balance is : "+balance);
		
	}

}
