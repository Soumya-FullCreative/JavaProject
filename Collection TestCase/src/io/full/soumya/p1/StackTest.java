package io.full.soumya.p1;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> s=new Stack<>();
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		s.push("e");
		
		s.add(2, "f");
		s.remove(2);
		
		System.out.println("Elements are : "+s);
		//retriving and removing top item
		s.pop();
		System.out.println(s);
		s.peek();
		System.out.println(s);
		s.peek();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.search("b"));

	}

}
