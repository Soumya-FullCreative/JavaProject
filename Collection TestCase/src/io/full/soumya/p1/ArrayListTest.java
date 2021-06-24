package io.full.soumya.p1;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>();
		al.add("a");
		al.add("s");
		al.add("d");
		al.add(5);
		al.add(5);
		al.add(null);
		
		al.add(3, "f");
		al.remove(3);
		
		System.out.println("Elements are : "+al);
		System.out.println("Third index is : "+al.get(3));
		
	

	}

}
