package io.full.soumya.p1;

public class Insert {

	public static void main(String[] args) {
		String s1="Soumya";
		System.out.println("Before insert : "+s1);
		
		s1=s1.substring(0, 2) + "Ranjan" + s1.substring(2, s1.length());
		System.out.println("After insert : "+s1);



	}

}
