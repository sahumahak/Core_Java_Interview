package com.rays.basicProgram;

public class RandomNumber2 {

	public static void main(String[] args) {
		int a ;
		
		for (int i = 1; i <= 5; i++) {
	
			 a= (int)(Math.random() * 100);
			 System.out.println(a);
		}
		
	}
}
