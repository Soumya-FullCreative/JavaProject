package io.full.soumya.inheritance;

public class Test {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.show();
		
		System.out.println("Name of the student is: " + s1.name);
	    System.out.println("Age of the student is: " + s1.age);
	    System.out.println("Student lives in: " + s1.city);
	    
	    System.out.println("Student Roll No is : " + s1.rollNo);
	    System.out.println("Marks obtained by the student is: " + s1.marks);
	    System.out.println("Student learns from: " + s1.tutorial);

	}

}
