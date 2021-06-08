package io.full.soumya.p14;

public class Test {

	public static void main(String[] args) {
		Bus b = new RedBus();
		b.engine();
		b.breaks();
		
		System.out.println();
		
		b=new Volvo();
		b.engine();
		b.breaks();
		

	}

}
