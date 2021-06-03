package com.nt.sp;

public class Frequerency {

	public static void main(String[] args) {
	
	
		String str="pankaj";
		int[]freq=new int[str.length()]; 
		int i,j;
		
		char string[]=str.toCharArray();
		
		for(i=0;i<str.length();i++) {
			freq[i]=1;
			for(j=i+1;j<str.length();j++) {
				if(string[i]==string[j]) {
					freq[i]++;
					
					string[j]='0';
				}
			}
		}
		
		//display the corresponding frequency
		System.out.println("display the current frequency : ");
		 for(i=0;i<freq.length;i++) {
			 if(string[i] != ' ' && string[i] !='0')
				 System.out.println(string[i]+" - "+freq[i]);
		 }
		 
/*
		String s1="abc";
		String s2="bcd";
		
		System.out.println(s1.compareTo(s2));  
		*/
	}

}
