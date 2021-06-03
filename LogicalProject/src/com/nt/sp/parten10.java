/*
*********
**** ****
***   ***
**     **
*       *
  
      
 */

package com.nt.sp;

public class parten10 {

	public static void main(String[] args) {
        //	int i;
		//	int j;
			
			for(int i=1;i<=4;i++) {
				for(int j=1;j<=4;j++) {
					if(j>=5-i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.print("\n");
			}
			

			 
			for(int i=1;i<=3;i++) {
				for(int j=1;j<=4;j++) {
					if(j>=1+i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.print("\n");
			}
			


	}

}
