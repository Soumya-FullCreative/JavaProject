package io.full.soumya.blogic;

import io.full.soumya.exceptions.InSufficientFundsException;
import io.full.soumya.exceptions.InvalidAmountException;

public interface Bank {
	public void deposite(double amt)throws InvalidAmountException;
	public double withdraw(double amt)throws InSufficientFundsException;
	public void balanceEnquiry();

}
