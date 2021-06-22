package io.full.soumya.object;

public class Test {

	public static void main(String[] args) {
		Student s1=new Admin();
		s1.name="soumya";
		s1.phone=9438586225L;
		s1.chat();
		
		Admin a1=(Admin) s1;
		a1.addUser(); 

	}

}
