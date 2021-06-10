package io.full.soumya.p1;

public class VarargsExample {
	 
	 static void display(int num, String... values){  
	  System.out.println("number is "+num);  
	  for(String s:values){  
	   System.out.println(s);  
	  }  
	 }  

	public static void main(String[] args) {
		 
		 display(500,"hello");//one argument  
		 System.out.println();
		 display(1000,"my","name","is","soumya");//four arguments 
	}

}
