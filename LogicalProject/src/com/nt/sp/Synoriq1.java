package com.nt.sp;

public class Synoriq1 {

	public static void main(String[] args) {
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=7;col++) {
				if((row==4 && col%2 !=0) || (row+col==5) || (col-row==3)) {
					 System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
				
				}
			System.out.println();
		}

	}

}
