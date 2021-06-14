package io.full.soumya.single;

public class Test {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.read();
		s1.eat();
		
		Person p1=new Person();
		p1.eat();
	//	p1.read();
		
		Person p2=new Student();
		p2.eat();
	//	p2.read();
		
		System.out.println("========");
	//	Student s2= new Person();
		
	//	System.out.println("result is "+s1.c);
	//	System.out.println(s1.a);
		
		
		
		

	}

}
