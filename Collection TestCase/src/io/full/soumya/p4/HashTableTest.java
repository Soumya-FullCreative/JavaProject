package io.full.soumya.p4;

import java.util.Hashtable;

public class HashTableTest {

	public static void main(String[] args) {
		Hashtable<Object,Object> h=new Hashtable<>();
		  h.put("hey", "hello");
		  h.put(100,"Amit");  
		  h.put(102,"Ravi");  
		  h.put(101,"Vijay");  
		  h.put(103,"Rahul");
		  h.put(109, "Soumya");
		  h.put(110, "Soumya");
	//	  h.put(108, null);
		  
		  System.out.println(h);
		  System.out.println(h.size());

	}

}
