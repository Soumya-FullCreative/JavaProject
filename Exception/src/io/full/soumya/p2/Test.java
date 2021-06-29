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
		
		/*The finally block in java is used to put important codes such as clean up code 
		 * e.g. closing the file or closing the connection. The finally block executes whether exception 
		 * rise or not and whether exception handled or not. A finally contains all the crucial statements
		 *  regardless of the exception occurs or not
		 */

	}

}
