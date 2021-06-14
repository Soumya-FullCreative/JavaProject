package io.full.soumya.p2;

public class Test {

	public static void main(String[] args) {
	//	Student s1=new Student("soumya",20,12);
		
		Student s1=new Student();
		s1.setName("Rama");
		s1.setRollNo(20);
		s1.setAge(12);
		
		System.out.println("Student Name is : "+s1.getName());
		System.out.println("Student Roll No is : "+s1.getRollNo());
		System.out.println("Student Age is : "+s1.getAge());
		

	}

}
