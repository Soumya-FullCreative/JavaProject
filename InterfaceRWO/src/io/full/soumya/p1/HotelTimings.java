package io.full.soumya.p1;

public interface HotelTimings {
	void open();
	void close();
	
		public default void eat() {
		System.out.println("Eat time in noon : 12-2");
	    }/*
	static void sleep() {
		System.out.println("sleep time 11 pm ");
	}  */

}
