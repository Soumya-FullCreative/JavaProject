package io.full.soumya.p1;

public abstract class Sim {
	Sim(){
		int x=10;
		int y=20;
		int z=x+y;
		System.out.println(z);
		
		System.out.println("Sim constructor called");
		
	}
	abstract void call();

}
