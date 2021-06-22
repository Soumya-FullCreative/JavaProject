package io.full.soumya.unboxing;

public class WrapperExample2 {
	public static void main(String args[]){  
	//Converting Integer to int    
	Integer a=new Integer(3);    
	int i=a.intValue();//converting Integer to int explicitly  
	int j=a;//unboxing, now compiler will write a.intValue() internally  
	
	Integer x=Integer.valueOf(5);
	int z=x;
	System.out.println(z);
	    
	System.out.println(a+" "+i+" "+j);    
}

}
