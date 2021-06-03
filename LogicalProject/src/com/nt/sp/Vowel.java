package com.nt.sp;

public class Vowel {

	public static void main(String[] args) {

      String str="Soumya Ranjan Palai";
        str= str.toLowerCase();
       str=   str.replace(" ","");
      char[] chars=str.toCharArray(); 
      int count=0;
      int consCount=0;
      
      for(int i=0;i<str.length();i++) {
    	  if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
    		  str.charAt(i) == 'o' || str.charAt(i) == 'u' ) {
    		  count++;
    	  }
    	  else 
    		  
    		  consCount++;
      }
      
      System.out.println("Total no vowel is :"+count);
      System.out.println("Total no consonant is :"+consCount);

	}

}
