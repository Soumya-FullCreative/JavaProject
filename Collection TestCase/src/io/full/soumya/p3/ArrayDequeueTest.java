package io.full.soumya.p3;

import java.util.ArrayDeque;

public class ArrayDequeueTest {
	public static void main(String[] args) {
		ArrayDeque<String> deque = new ArrayDeque<>();  
		   deque.add("Somu");
		   deque.offerFirst("sinu");
		   deque.add("Rama");
		   deque.offer("Arvind");  
		   deque.offer("Vimal");  
		   deque.add("Hari");
		//   deque.offerFirst("jai"); 
		   
		   
		   //Traversing elements  
		   for (String str : deque) {  
		   System.out.println(str);  
		   }  
		   System.out.println("======================");
		   
		   System.out.println(deque.pollFirst());
		   System.out.println(deque.pollLast());
		   System.out.println(deque.poll());
	}

}
