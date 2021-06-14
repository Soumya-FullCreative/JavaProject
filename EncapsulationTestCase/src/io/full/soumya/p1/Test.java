package io.full.soumya.p1;

public class Test {

	public static void main(String[] args) {
		Account acc1=new Account();
		
		acc1.setAccNo(12345678925L);
		acc1.setName("Soumya Ranjan");
		acc1.setEmail("abc@gmail.com");
		acc1.setBlance(50000);
		
		System.out.println("Account No is : "+acc1.getAccNo());
		System.out.println("Account HName is : "+acc1.getName());
		System.out.println("Account HName email is : "+acc1.getEmail());
		System.out.println("Account HName balance is : "+acc1.getBlance());

	}

}
