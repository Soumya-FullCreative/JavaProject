package io.full.soumya.p12;

public class Test {

	public static void main(String[] args) {
		Sim s1=new AirtelPrepaid();
		Sim s2=new Bsnl();
		
		
		s1.sms();
		s1.call();
		System.out.println();
		s2.call();
		s2.sms();
		

	}

}
