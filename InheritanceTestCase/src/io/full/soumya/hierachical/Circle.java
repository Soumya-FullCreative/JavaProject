package io.full.soumya.hierachical;

public class Circle extends Shape{
	static final double PI=3.14;
	double r=3;
	void calculate() {
		System.out.println("Circle area is : "+(PI*r*r));
	}

}
