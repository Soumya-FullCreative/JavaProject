package io.full.soumya.p4;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
	
		Map<String,Object> marks = new HashMap<String,Object>();

        marks.put("name","sabitha");
        marks.put("name", 5);

        marks.put("name","soumya");
    //   System.out.println(marks);

        System.out.println(marks.get("name"));  
		


	}

}
