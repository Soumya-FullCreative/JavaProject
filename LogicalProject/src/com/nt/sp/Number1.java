/*
      1    
      12   
      123  
      1234 
      12345
*/

package com.nt.sp;

public class Number1 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int k=1;
			for(int j=1;j<=5;j++) {
				if(j<=i)
					System.out.print(+k);
				else
					System.out.print(" ");
				k++;
			}
			System.out.print("\n");
		}
		

	}

}
