package io.full.soumya.p3;

public class Test {

	public static void main(String[] args) {
		
		ElectronicDevice.setDeviceName("Realme");
		
		ElectronicDevice d1=new ElectronicDevice();
		d1.setOwnerName("Rama");
		d1.setOwnerAddress("HYD");
		
		d1.setImeiNo(15864285245866L);
		
		System.out.println("Electronic device details is : =>");
		System.out.println("Device Name : "+ElectronicDevice.getDeviceName());
		System.out.println("Owner Name : "+d1.getOwnerName());
		System.out.println("Owner Address : "+d1.getOwnerAddress());
		System.out.println("IMEI No : "+d1.getImeiNo());

	}

}
