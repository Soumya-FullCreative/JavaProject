package io.full.soumya.p3;
//method overloading
public class Student {
	String name;
	int rollNo;
	int age;
	String standard;
	
	void read(String name,int rollNo) {
		this.read(name,rollNo,12);
		this.name=name;
		this.rollNo=rollNo;
		System.out.println("Name is : "+name+"\nRollNo is:"+rollNo+"\nAre studying Java");
		System.out.println();
	}
	void read(String name,int rollNo,int age) {
		this.read(name, rollNo, age, "X");
		this.name=name;
		this.rollNo=rollNo;
		this.age=age;
		System.out.println("Name is : "+name+"\nRollNo is:"+rollNo+ "\nAge is : "+age+"\nAre studying Oracle");
		System.out.println();
	}
	void read(String name,int rollNo,int age,String standard) {
		this.name=name;
		this.rollNo=rollNo;
		this.age=age;
		this.standard=standard;
		System.out.println("Name is : "+name+"\nRollNo is:"+rollNo+ "\nAge is : "+age+ "\nStandard is : "+standard+"\nAre studying Html");
		System.out.println();
	}
	

}
