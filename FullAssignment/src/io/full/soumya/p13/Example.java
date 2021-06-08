package io.full.soumya.p13;

//static and non static execution flow

public class Example {
	static int a=m1();
	int x=m2();

	 static int m1() {
		System.out.println("Sv is executed");
		return 10;
	}

	 int m2() {
		System.out.println("NSV is executed");
		return 20;
	}
	 
	 static {
		 System.out.println("SB start");
		 System.out.println("SB end");
	 }
	 
	 {
		 System.out.println("NSB executed");
	 }
	 
	 Example(){
		 System.out.println("Constructor executed");
	 }

	public static void main(String[] args) {
		System.out.println("MM start");
		new Example();
		System.out.println("MM end");

	}


}
