package com.rays.basicProgram;

public class SecondLowest {
	public static void main(String[] args) {
		
	
	int[] num = { 30, 20, 100, 50, 60 };
	int temp = 0;
	int count = 0;

	for (int i = 0; i < num.length; i++) {

		if (temp < num[i]) {
			count = temp;
			temp = num[i];
		}

		if (count > num[i] && temp < num[i]) {

			count = num[i];
		}

}
		System.out.println("second lowest : "+count);
	}
}
