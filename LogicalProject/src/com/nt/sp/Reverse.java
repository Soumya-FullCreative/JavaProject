package com.nt.sp;

public class Reverse {

	public static void main(String[] args) {
		String str="12345";
		String rev="";
		//int len=str.length();
		

		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		System.out.println("reverse of " +str+ " is " +rev);
	}

}
