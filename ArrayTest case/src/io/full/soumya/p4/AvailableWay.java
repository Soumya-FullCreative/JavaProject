package io.full.soumya.p4;

import java.util.Arrays;

public class AvailableWay {

	public static void main(String[] args) {
		int[] array = new int[5] ;
		
        //Printing the elements of array
        for (int i =0;i < 5;i++)
        {
            System.out.println(array[i]);
        }
        System.out.println(Arrays.toString(array));
        
        int[] arr;
        //Array Initialization
        arr = new int[]{1,2,3,4,5}; //2
        //Printing the elements of array
        for (int i =0;i < 5;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        
        int[] ar = {11,12,13,14,15}; //3
        //Printing the elements of array
        for (int i =0;i < 5;i++)
        {
            System.out.println(ar[i]);
        }
        System.out.println(Arrays.toString(ar));
        
	}

}
