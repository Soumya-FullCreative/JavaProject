package io.full.soumya.p4;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapTest {

	public static void main(String[] args) {
    LinkedHashMap<Object,Object> lhm=new LinkedHashMap<>();
		
		//add operation
		lhm.put(1, "Somu");
		lhm.put(2,"Rama");
		lhm.put(5, "Ranu");
		lhm.put(4,"Silu");
		lhm.put(3, "Sanu");
		lhm.put("shy", "Hey");
		lhm.put("shine",12);
		lhm.put(11,"Hello");
		lhm.put(8, "Jay");
		lhm.put(9,"Jitu");
		lhm.put(null, 13);
	//	hm.put(2,"Rama");
		
		
		System.out.println(lhm);
		System.out.println(lhm.size());
		
		
		//replace
				System.out.println(lhm.put(2, "Dama"));
			//	System.out.println(hm.put(16, "hiiiii"));
		//add if absent
				lhm.putIfAbsent(null, 20);
				
				System.out.println(lhm);
				System.out.println("===========================");

		//retrieving one value randomly by get()
				Object obj=lhm.get("shy");
				Object obj1=lhm.get(null);
				Object obj2=lhm.get(101);
				
				System.out.println(obj);
				System.out.println(obj1);
				System.out.println(obj2);
				System.out.println("==========================");
				/*if key is not there then it will return null 
				 * and also it the key value assign to null then it also return null
				 */
				

		//retrieving value get() and getOrDefault()
						Object obj3=lhm.get("Soumya");
						Object obj4=lhm.getOrDefault("Soumya", "Key is not available");
						Object obj5=lhm.getOrDefault(8, "Key is not available");
						
						System.out.println(obj3);
						System.out.println(obj4);
						System.out.println(obj5);
						System.out.println("========================");
						/* if we use getOrDefault method then it will return ,
						 * if the key is there then return value ,if key is not there then it will return whatever value you pass as value
						 */
						
		//retrieving all keys
						Set<Object> keys=lhm.keySet();
						for(Object key:keys) {
							System.out.println(key);
						}
						System.out.println("===========================");
						
		//retrieving all values
						Collection<Object> values=lhm.values();
						for(Object value:values) {
							System.out.println(value);
						}
						System.out.println("================================");
						
		//retrieving all keys and values
						Set<Map.Entry<Object, Object>> entries=lhm.entrySet();
						for(Map.Entry<Object, Object> entry:entries) {
							System.out.println(entry);
						}
						//entries.forEach(System.out::println);
						System.out.println("=======================");
						
		//retrieving all keys and values
						Set<Object> keys1=lhm.keySet();
						for(Object key:keys1) {
							Object value=lhm.get(key);
							System.out.println(key+ " : "+value);
						}    
						System.out.println("====================");
						
		//searching
						System.out.println(lhm.containsKey(null));
						System.out.println(lhm.containsKey(2));
						System.out.println("==================");
						
		//removing
						System.out.println(lhm);
						lhm.remove(2);
						System.out.println(lhm);
					}

}
