package io.full.soumya.p1;

import java.util.Arrays;

//single dimensional array

public class Test {
	
	public static void main(String[] args) {
	
		int[] ia =new int[] {1,2,3,4,5} ;	
		double[] da;
		da=new double[] {1,2,3};
		

		
		
		System.out.println("Before update :"+ia[3]);
		ia[3]=9;
		System.out.println("After update: "+ia[3]);
		
		System.out.println("================");
		for(int i=0;i<ia.length;i++) {
			System.out.println("Elements are :"+ia[i]);
		}
		System.out.println("===============");
		System.out.println( Arrays.toString(ia));
		
		System.out.println("==============");
		for(double d=0;d<da.length;d++) {
			System.out.println("Elements are :"+da[(int) d]);
			
		}
		System.out.println("==============");
		System.out.println("length is : "+ia.length);
		System.out.println("==============");
		System.out.println("length is : "+da.length);
		



	}

}
