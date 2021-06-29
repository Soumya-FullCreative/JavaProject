package io.full.soumya.p1;

public class SumNatural {
	
	static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return n+sum(n-1);
	}

	public static void main(String[] args) {
		System.out.println("Sum is : "+sum(5));

	}

}
