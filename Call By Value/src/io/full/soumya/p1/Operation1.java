package io.full.soumya.p1;


public class Operation1 {
	
	int data=50;  
	  
	 void change(Operation1 op){  
	 op.data=op.data+100;//changes will be in the instance variable  
	 }  
	     

	public static void main(String[] args) {
		Operation1 op=new Operation1();  
		  
		   System.out.println("before change "+op.data);  
		   op.change(op);//passing object  
		   System.out.println("after change "+op.data);  
		  
	}

}
