package io.full.polymorphism.p22;

//compile time polymorphism /method overloading
public class Addition {
	void add(int a,int b) {
		System.out.println("sum is: " +(a+b));
	}
	
	void add(int a,int b,int c) {
		System.out.println("Sum is : "+(a+b+c));
	}

	public static void main(String[] args) {
		Addition a1=new Addition();
		a1.add(10,20);
		a1.add(10, 20, 30);

	}

}
