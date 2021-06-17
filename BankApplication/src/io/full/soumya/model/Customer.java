package io.full.soumya.model;

public class Customer {
	private String name;
	private String villageName;
	private int pinCode;
	private String ps;
	private long aadhaarNum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVillageName() {
		return villageName;
	}
	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
	public long getAadhaarNum() {
		return aadhaarNum;
	}
	public void setAadhaarNum(long aadhaarNum) {
		this.aadhaarNum = aadhaarNum;
	}
	
	
	public void displayAllDetails() {
		System.out.println("Name: "+name);
		System.out.println("Village Name: "+villageName);
		System.out.println("Pincode: "+pinCode);
		System.out.println("Police Station: "+ps);
		System.out.println("AAdhaar No: "+aadhaarNum);
	}
}
