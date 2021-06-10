package io.full.soumya.p1;

public class VarargsEx2 {
	
	void show(String... book) {
		for(String s1:book) {
			System.out.println(s1);
		}
		
	}

	public static void main(String[] args) {
		VarargsEx2 v1=new VarargsEx2();
		v1.show("phy","chem","math");

	}

}
