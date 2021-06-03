/*
54321
5432
543
54
5

*/

package com.nt.sp;

public class Number3 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int k=5;
			for(int j=1;j<=5;j++) {
				if(j<=6-i)
					System.out.print(+k);
				else
					System.out.print(" ");
				k--;
			}
			System.out.print("\n");
		}

	}

}
