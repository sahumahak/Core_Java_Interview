package com.rays.basicProgram;

public class SecondHig {

	public static void main(String[] args) {

		int[] num = { 30, 20, 100, 50, 60 };
		int temp = 0;
		int count = 0;

		for (int i = 0; i < num.length; i++) {

			if (temp < num[i]) {
				count = temp;
				temp = num[i];
			}

			if (count < num[i] && temp > num[i]) {

				count = num[i];

			}

		}
		System.out.println("second largest : "+count);

		//First Largest
//		int[] a = { 56, 89, 41, 32, 52, 879, 41 };
//		int b = a[0];
//
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] > b) {
//				b = a[i];
//
//			}
//
//		}
//		System.out.println("Largest No is: " + b);
	}

}
