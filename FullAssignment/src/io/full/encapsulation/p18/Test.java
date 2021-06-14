package io.full.encapsulation.p18;

public class Test {

	public static void main(String[] args) {
		BankAccount acc1=new BankAccount();
		
		acc1.setBalance(5000);
		System.out.println("Your balance is :"+acc1.getBalance());
		
		
	//	acc1.setBalance(-2000);
	//	System.out.println(acc1.getBalance());
		
		

	}

}
