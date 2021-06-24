package io.full.soumya.p2;

import java.util.Scanner;

public class LengthPasswordTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter Password");
			String pass=sc.nextLine();
			if(pass.isEmpty()) {
				System.out.println("Enter Password Again");
				continue;
			}else {
				pass=pass.trim();
				if(pass.isEmpty()) {
					System.out.println("Enter password again");
					continue;
				}else {
					pass=pass.replace(" ", "");
					if(pass.length()>=8 && pass.length()<=16) {
						System.out.println("Registration successful");
						break;
					}else {
						System.out.println("Enter Correct password again-between 8 to 16 characters");
						continue;
					}//inner else
				}//inner else
			}//outer else
		}//while
		if(sc!=null)
			sc.close();

	}

}
