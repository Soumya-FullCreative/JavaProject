package io.full.soumya.p2;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Object> hs=new HashSet<>();
		hs.add("a"); 
		hs.add("s");
		hs.add("d");
		hs.add("f");
		hs.add(5);
		hs.add(5);  
		hs.add(null);
		hs.add(3);
		
		
		hs.remove(3);
		System.out.println("Size is : "+hs.size());
		System.out.println("Elements are : "+hs);
		
	}

}
