package io.full.soumya.implict;

public class Test {
	public static void main(String[] args) {
	
    int i = 100; 
    char ch='a';
    
    
    int a=ch;
    System.out.println(a);
      
    // automatic type conversion
    long l = i; 
      
    // automatic type conversion
    float f = l; 
    
    
    System.out.println("Int value "+i);
    System.out.println("Long value "+l);
    System.out.println("Float value "+f);
    
	}

}
