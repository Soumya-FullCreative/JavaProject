package io.full.soumya.p4;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		
		System.out.println("Before reverse an array list : "+al);
		
		Collections.reverse(al);
		System.out.println("After reverse an arraylist : "+al);

	}

}
