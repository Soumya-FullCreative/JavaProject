package io.full.soumya.p1;

public class Test1 {

	public static void main(String[] args) {
		String s1=new String("Soumya Ranjan");
		String s2=s1.concat(" Palai");
	//	System.out.println(s1.length());
		System.out.println(s2);
	//	System.out.println(s);
		
		String[] s3=s1.split("\\s");
		for(String s:s3){  
			System.out.println(s);  
			}  
		
		
		
		StringBuffer sb1=new StringBuffer("jay");
		sb1=sb1.append(" jagannath");
		//sb1=sb1.insert(1, "gi");
		System.out.println(sb1);
		System.out.println(sb1.deleteCharAt(1));

		
		
		StringBuilder sb=new StringBuilder("hello");
		sb=sb.append(" bye");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.deleteCharAt(1));

	}

}
