package com.rays.basicProgram;

public class MethodCalling2 {

	public static void main(String[] args) {

		int[] num = { 18, 17, 16, 14, 5, 6, 7, 8 };
		int num2 = 15;

		int temp = findIndex(num, num2); 
		

		System.out.println(temp);
	}

	public static int findIndex(int[] num, int num2) {  // num num2 as a input liya he
		int temp = -1;

		for (int i = 0; i < num.length; i++) {
			if (num2 == num[i]) {
				temp = num[i];
				temp = i ;				// break;
			}
		}

		return temp;
	}

	
}