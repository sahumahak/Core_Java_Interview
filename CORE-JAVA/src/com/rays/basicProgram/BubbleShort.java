package com.rays.basicProgram;

public class BubbleShort {

	public static void main(String[] args) {

		int[] num = { 60, 20, 50, 30, 10, 40};
		int temp = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {

				if (num[i] > num[j]) {

					temp = num[i];
					num[i] = num[j];
					num[j] = temp;

				}

			}
			System.out.println(num[i]);

		}

	}

}
