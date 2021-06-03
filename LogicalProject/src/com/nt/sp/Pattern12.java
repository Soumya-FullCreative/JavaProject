package com.nt.sp;

public class Pattern12 {

	
	public static void main(String[] args) {
		int i,j;
	//	int n=5;

	for(i=1;i<=3;i++){
		
		for(j=1;j<=5;j++){
		   if(j>=4-i && j<=2+i){
			   if(i==1  || (i==2 && j%2==0) || (i==3 && j%2!=0))
			
				System.out.print("*");
			    
			   
			   else
				   System.out.print("#");
				
			
			}
			else{
			System.out.print(" ");
			
			}

	 
	}
	System.out.println();
		
	
		}
	

	for(i=1;i<=2;i++){
		
		for(j=1;j<=5;j++){
		   if(j>=i+1 && j<=5-i){
			   if(i==2|| j%2==0)
			
				System.out.print("*");
			   else
				   System.out.print("#");
				
			
			}
			else{
			System.out.print(" ");
			
			}

	
	}
	System.out.println();
	}
	}
	

}

