package com.nt.sp;

public class Pattern7 {

	
	public static void main(String[] args) {
		int i,j;
	//	int n=5;

	for(i=1;i<=3;i++){
		
		for(j=1;j<=5;j++){
		   if(j>=4-i && j<=2+i){
			
				System.out.print("*");
				
			
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
			
				System.out.print("*");
				
			
			}
			else{
			System.out.print(" ");
			
			}

	
	}
	System.out.println();
	}
	}
	

}

