package io.full.soumya.p1;

public class Student {
	int rollNo;
	String name;
	String address;
	
	public Student(int rollNo) {
	
	//	this(5,"hk");
		this.rollNo = rollNo;
		System.out.println("roll no is :"+rollNo);
	}

	public Student(int rollNo, String name) {
	//	this(10,"Bk","HYD");
		
		this.rollNo = rollNo;
		this.name = name;
		System.out.println("roll no is :"+rollNo+ " Name is :"+name);
	}

	public Student(int rollNo, String name, String address) {
		
		
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		System.out.println("roll no is :"+rollNo+ " Name is :"+name+ " Address is : "+address);
	}
	
	
	

}
