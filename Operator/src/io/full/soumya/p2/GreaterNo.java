package io.full.soumya.p2;

public class GreaterNo {

	public static void main(String[] args) {
		 int n1 = 5, n2 = 10, n3 = 15, max;
		 
		 n1=n1++ + ++n2 + --n3 - ++n1;
	     
		    // Largest among n1, n2 and n3
		    max = (n1 > n2) ?
		          (n1 > n3 ? n1 : n3) :
		          (n2 > n3 ? n2 : n3);
		     
		    // Print the largest number
		    System.out.println("Largest number among " + n1 +
		                             ", " + n2 + " and " + n3 +
		                                 " is : " + max + ". " );

	}

}
