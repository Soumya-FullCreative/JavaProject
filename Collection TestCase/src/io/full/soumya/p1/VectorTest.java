package io.full.soumya.p1;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<Object> v=new Vector<>();
		v.add("a");
		v.add("b");
		v.add(5);
		v.add(true);
		v.add('c');
		v.add(10.5);
		
		v.add(1, "g");
		v.remove(1);
		System.out.println("Size : "+v.size());
		System.out.println("Elements : "+v);
		System.out.println("Third index : "+v.get(3));
		

	}

}
