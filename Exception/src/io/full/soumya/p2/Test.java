package io.full.soumya.p2;

public class Test {

	public static void main(String[] args) {
		try {
			System.out.println("inner try");
			System.out.println(10/0);
		}
		catch(NullPointerException ae) {
			System.out.println("in catch");
		}
		finally {
			System.out.println("in finally");
		}
		System.out.println("After all");

	}

}
