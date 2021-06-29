package io.full.soumya.p3;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<Object> queue=new PriorityQueue<>();    
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul"); 
	
		//queue.add(null);
		
		System.out.println(queue);
		System.out.println("=========================");
		
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} 
		System.out.println("======================");
		
		System.out.println(queue.remove());  
		System.out.println(queue.poll());  
		System.out.println("=================");
		
		System.out.println(queue);
		
		System.out.println("head : "+queue.peek());
		System.out.println("size : "+queue.size());

	}

}
