package com.nt.sp;

public class Synoriq3{

	public static void main(String[] args) {
		String[] str= {"Facebook","Google","Facebook"};
		int fbCount=0;
		int googleCount=0;
		
		for(int i=0;i<str.length;i++) {
		    if(str[i].equalsIgnoreCase("Facebook")) {
		    	fbCount++;
		    }
		    else if(str[i].equalsIgnoreCase("Google")) {
		    	googleCount++;
		    }
		    else {
		    	
		    }
	}
		if(fbCount>googleCount) {
			System.out.println("Facebook");
		}
		else {
			System.out.println("Google");
		}
	}

}
