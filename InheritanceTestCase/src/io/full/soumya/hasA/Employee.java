package io.full.soumya.hasA;

public class Employee {
	public String eName;
	public int eId;
	public Address address;
	
	public Employee(String eName, int eId, Address address) {
		
		this.eName = eName;
		this.eId = eId;
		this.address = address;
	}
	
	void display(){  
		System.out.println(eId+" "+eName);  
		System.out.println(address.city+" "+address.state+" "+address.country);  
		}  
	
	
	

}
