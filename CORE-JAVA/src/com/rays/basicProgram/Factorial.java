package com.rays.basicProgram;

public class Factorial {

	public static void main(String[] args) {

		int fact = 1;
		int num = 7;

		for (int i = num; i > 0; i--) {

			fact = fact * i;

		}
		
		System.out.println(fact);

	}

}
