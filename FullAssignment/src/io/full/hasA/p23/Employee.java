package io.full.hasA.p23;

public class Employee {
	int id;  
	String name;  
	Address address;  
	
	

	public Employee(int id, String name, Address address) {
	//	super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display(){  
		System.out.println(id+" "+name);  
		System.out.println(address.city+" "+address.state+" "+address.country);  
		}  




	public static void main(String[] args) {
		Address address1=new Address("Pmi","OD","India");  
		Address address2=new Address("Aul","OD","India");  
		  
		Employee e1=new Employee(111,"somu",address1);  
		Employee e2=new Employee(112,"Ramu",address2);  
		      
		e1.display();  
		e2.display();

	}

}
