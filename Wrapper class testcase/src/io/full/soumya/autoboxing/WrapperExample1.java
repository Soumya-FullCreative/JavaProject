package io.full.soumya.autoboxing;

public class WrapperExample1 {
	/* we can use valueOf() method to create wrapper class object for the given primitives
	 * and strings..(as alternative to constructor) 
	 */

	public static void main(String[] args) {
		//Converting int into Integer  
		int a=20;  
		Integer k=new Integer(a);
		Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
		
		Double d=Double.valueOf(a);
		System.out.println(d);
		
		Byte b=Byte.valueOf((byte) a);
		System.out.println(b);
		
	//	System.out.println(j);
		System.out.println(k);
		  
		System.out.println(a+" "+i+" "+j);  
	}

}
