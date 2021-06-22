package io.full.soumya.explicit;

public class Test {

	public static void main(String[] args) {
		  double d = 258.04; 
          
	        //explicit type casting
	        long l = (long)d;
	          
	        //explicit type casting 
	        int i = (int)l; 
	        byte b=(byte) d;
	        
	        System.out.println("Double value "+d);
	          
	       
	        System.out.println("Long value "+l); 
	        System.out.println("Int value "+i); 
	        System.out.println("Byte value is "+b);
	}

}
