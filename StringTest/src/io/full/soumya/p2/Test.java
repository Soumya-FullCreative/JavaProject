package io.full.soumya.p2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :::");
		System.out.println("The appended resultant string is ::: "+addString(sc.nextLine()));
		
		if(sc!=null)
			sc.close();
	}
	public static String addString(String str) {
		String s="Hyderabad";
		StringBuilder sb=new StringBuilder(str+" ");
		
		for(int i=0;i<s.length();i++) {
			sb=sb.append(s.charAt(i));
		}
		String result=new String(sb);
		return result;
	}

}
