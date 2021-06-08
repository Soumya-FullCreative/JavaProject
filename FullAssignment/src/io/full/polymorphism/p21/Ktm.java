package io.full.polymorphism.p21;

public class Ktm extends Bike{
	void run() {
		super.run();
		System.out.println("Ktm running safely with 70 kmph");
	
	}
	

	public static void main(String[] args) {
		Bike b=new Ktm();
		b.run();
		
		
		

	}

}
