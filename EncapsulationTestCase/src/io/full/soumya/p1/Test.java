package io.full.soumya.p1;

public class Test {

	public static void main(String[] args) {
		Account acc1=new Account();
		
		Account.setBankName("SBI");
		Account.setBranchName("Pattamundai");
		acc1.setAccNo(12345678912L);
		acc1.setName("Soumya Ranjan");
		acc1.setEmail("abc@gmail.com");
		acc1.setBalance(5000);
		
		System.out.println("your data is =>");
		System.out.println("Bank Name : "+Account.getBankName());
		System.out.println("Branch Name : "+Account.getBranchName());
		System.out.println("Account No : "+acc1.getAccNo());
		System.out.println("Name is : "+acc1.getName());
		System.out.println("Mail id is : "+acc1.getEmail());
		System.out.println("Balance is : "+acc1.getBalance());

	}

}
