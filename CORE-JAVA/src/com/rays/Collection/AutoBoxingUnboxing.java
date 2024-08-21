package com.rays.Collection;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {

		// AutoBoxing

		int a = 1;
		
		Integer b = a;
		

		
		System.out.println("Wrapper Int :" + b);

		// Unboxing

		Integer c= new Integer(15);
		int d= c;

		
		System.out.println(d);

	}
}
