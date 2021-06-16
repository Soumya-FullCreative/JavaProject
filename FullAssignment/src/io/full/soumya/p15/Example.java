package io.full.soumya.p15;

//constructor example

public class Example {
	
	  private Example(){
		
		System.out.println("0-param constructor executed");
		
	}
	
	  private Example(int a){
		
		System.out.println("1-param constructor executed"+a);
		
	}
	  
	  public static void main(String[] args) {
	
	  Example e1=new Example();
    //	Example e2=new Example();

	  }

}
