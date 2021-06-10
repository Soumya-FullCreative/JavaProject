package io.full.soumya.p1;

public class Test {

	public static void main(String[] args) {
		RegularEmployee r1=new RegularEmployee();
		r1.business();
		r1.salary();
		
		System.out.println();
		
		ContractEmployee c1=new ContractEmployee();
		c1.business();
		c1.salary();

	}

}
