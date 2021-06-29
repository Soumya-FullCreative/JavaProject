package io.full.soumya.p4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Object,Object> hm=new HashMap<>();
		
		//add operation
		hm.put(1, "Somu");
		hm.put(2,"Rama");
		hm.put(5, "Ranu");
		hm.put(4,"Silu");
		hm.put(3, "Sanu");
		hm.put("shy", "Hey");
		hm.put("shine",12);
		hm.put(11,"Hello");
		hm.put(8, "Jay");
		hm.put(9,"Jitu");
		hm.put(null, 13);
		hm.put(10,"Hello");
	//	hm.put(2,"Rama");
		
		
		System.out.println(hm);
		System.out.println(hm.size());
	
//replace
		System.out.println(hm.put(2, "Dama"));
	//	System.out.println(hm.put(16, "hiiiii"));
//add if absent
		hm.putIfAbsent(null, 20);
		
		System.out.println(hm);
		System.out.println("===========================");

//retrieving one value randomly by get()
		Object obj=hm.get("shy");
		Object obj1=hm.get(null);
		Object obj2=hm.get(101);
		
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println("==========================");
		/*if key is not there then it will return null 
		 * and also it the key value assign to null then it also return null
		 */

//retrieving value get() and getOrDefault()
		Object obj3=hm.get("Soumya");
		Object obj4=hm.getOrDefault("Soumya", "Key is not available");
		Object obj5=hm.getOrDefault(8, "Key is not available");
		
		System.out.println(obj3);
		System.out.println(obj4);
		System.out.println(obj5);
		System.out.println("========================");
		/* if we use getOrDefault method then it will return ,
		 * if the key is there then return value ,if key is not there then it will return whatever value you pass as value
		 */
		
//retrieving all keys
		Set<Object> keys=hm.keySet();
		for(Object key:keys) {
			System.out.println(key);
		}
		System.out.println("===========================");
		
//retrieving all values
		Collection<Object> values=hm.values();
		for(Object value:values) {
			System.out.println(value);
		}
		System.out.println("================================");
		
//retrieving all keys and values
		Set<Map.Entry<Object, Object>> entries=hm.entrySet();
		for(Map.Entry<Object, Object> entry:entries) {
			System.out.println(entry);
		}
		//entries.forEach(System.out::println);
		System.out.println("=======================");
		
//retrieving all keys and values
		Set<Object> keys1=hm.keySet();
		for(Object key:keys1) {
			Object value=hm.get(key);
			System.out.println(key+ " : "+value);
		}    
		System.out.println("====================");
		
//searching
		System.out.println(hm.containsKey(null));
		System.out.println(hm.containsKey(2));
		System.out.println("==================");
		
//removing
		System.out.println(hm);
		hm.remove(2);
		System.out.println(hm);
	}

}
