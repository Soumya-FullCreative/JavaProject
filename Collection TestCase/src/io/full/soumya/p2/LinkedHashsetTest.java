package io.full.soumya.p2;

import java.util.LinkedHashSet;

public class LinkedHashsetTest {

	public static void main(String[] args) {
		LinkedHashSet<Object> lhs=new LinkedHashSet<>();
		lhs.add("a"); 
		lhs.add("s");
		lhs.add("d");
		lhs.add("f");
		lhs.add(5);
		lhs.add(5);  
		lhs.add(null);
		lhs.add(3);
		lhs.add(new Example(5,6));
		
	
		
		
		lhs.remove(3);
		System.out.println("Size is : "+lhs.size());
		System.out.println("Elements are : "+lhs);

	}

}
