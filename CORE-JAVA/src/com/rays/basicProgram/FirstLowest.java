package com.rays.basicProgram;

public class FirstLowest {
	public static void main(String[] args) {
		
		int[] a = { 30, 20, 100, 50, 60 };
		int b = a[0];
	
		for (int i = 0; i < a.length; i++) {
				if (a[i] < b) {
						b = a[i];
				}
				}
	  	System.out.println("Lowest No is: " + b);
			
		
		
		
	}

}
