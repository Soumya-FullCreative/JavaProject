//class variables, instance variables and local variables
package io.full.soumya.p7;

public class VariableExample {
	   int x=100;            //instance variable
	   static int y= 30;     //static variable(class variable)
	   
	   public static void main(String args[]){
	      int a = 100;       //local variable
	      
	      VariableExample obj = new VariableExample();
	      
	      System.out.println("Value of instance variable: "+obj.x);
	      System.out.println("Value of static variable: "+y);
	      System.out.println("Value of local variable a: "+a);
	   }

}
