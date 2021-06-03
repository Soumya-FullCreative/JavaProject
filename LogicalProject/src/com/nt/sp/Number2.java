/*
    5    
   456   
  34567  
 2345678 
123456789
*/
package com.nt.sp;

public class Number2 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int k=1;
			for(int j=1;j<=9;j++) {
				if(j>=6-i && j<=4+i)
					System.out.print(+k);
				else
					System.out.print(" ");
				
				k++;
			}
			System.out.print("\n");
		}
		

	}

}
