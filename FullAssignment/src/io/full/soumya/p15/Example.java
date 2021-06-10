package io.full.soumya.p15;

//constructor example

public class Example {
	
	Example(){
		this(5);
		System.out.println("0-param constructor executed");
		
	}
	
	Example(int a){
		
		System.out.println("1-param constructor executed"+a);
		
	}

	public static void main(String[] args) {
		Example e1=new Example();
	//	e1.Example(5);
	//	Example e2=new Example(5);
		

	}

}
