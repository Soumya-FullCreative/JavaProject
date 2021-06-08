package io.full.soumya.p16;

//constructor overloading

public class Employee {
	int id;  
	String name;  
	
	  
	Employee(){  
	System.out.println("this a default constructor");  
	}  
	
	
	 Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
	}


	public static void main(String[] args) {
		Employee e = new Employee();  
		System.out.println("Default Constructor values: ");  
		System.out.println("Employee Id : "+e.id + " Employee Name : "+e.name);  
		
		System.out.println("Parameterized Constructor values: ");  
		Employee e1 = new Employee(7, "Soumya");  
		System.out.println("Employee Id : "+e1.id + " Employee Name : "+e1.name);

	}

}
