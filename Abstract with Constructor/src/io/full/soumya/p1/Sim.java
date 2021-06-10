package io.full.soumya.p1;

public abstract class Sim {
	Sim(){
		int a=10;
		int b=20;
		int c=a+b;

		System.out.println("Sim constructor called");
		
	}
	abstract void call();

}
