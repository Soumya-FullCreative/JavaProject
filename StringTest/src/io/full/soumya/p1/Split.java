package io.full.soumya.p1;

public class Split {

	public static void main(String[] args) {
		String s1="welcome to java language";  
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",0)){  
		System.out.println(w);  
		}  
		 
		System.out.println("===============");
		
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",1)){  
		System.out.println(w);  
		}  
		System.out.println("===================");
		
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",2)){  
		System.out.println(w);  
		}  
		System.out.println("======================");
		
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",3)){  
		System.out.println(w);  
		}  

	}

}
