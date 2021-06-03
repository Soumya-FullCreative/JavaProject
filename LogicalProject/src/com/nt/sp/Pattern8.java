package com.nt.sp;

public class Pattern8 {

	
	public static void main(String[] args) {
		int i,j;
	//	int n=5;

	for(i=1;i<=5;i++){
		
		for(j=5;j>=1;j--){
			 if(i%2==0)
				   break;
		   if(i>=j){
			   if(j%2==0) {
				  
			
				System.out.print("# ");
			
			}
			else{
			System.out.print("* ");
			
			}

	
	}
		   else {
			   System.out.print(" ");
		   }
		   }
	System.out.println();
		
	
		}
	

	for(i=1;i<=3;i++){
		
		for(j=5;j>=1;j--){
			 if(i%2==0)
				   break;
		   if(i>=j){
			   if(j%2==0) {
				  
			
				System.out.print("# ");
			
			}
			else{
			System.out.print("* ");
			
			}

	
	}
		   else {
			   System.out.print(" ");
		   }
		   }
	System.out.println();
	}
	}

}

