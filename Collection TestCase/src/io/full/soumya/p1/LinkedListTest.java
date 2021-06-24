package io.full.soumya.p1;


import java.util.LinkedList;

import io.full.soumya.p2.Example;

public class LinkedListTest {

	public static void main(String[] args) {
	//	int [] arr=new int{1,2,3};
	//	Object [] obj=new Object[4];
	//	obj[0]="s";
	//	obj[1]=2;
		
		LinkedList<Object> ll=new LinkedList<>();
		ll.add("a"); 
		ll.add("s");
		ll.add("d");
		ll.add("f");
		ll.add(5);
		ll.add(5);  
		ll.add(null);
		ll.add(new Example(5,6));
		
		ll.add(3, "f");
		ll.remove(3);
		
		for(Object o : ll) {
			System.out.println("After for : "+o);
			
		}  
		
		System.out.println("Elements are : "+ll);
		System.out.println("Third index is : "+ll.get(3));

	}

}
