package com.rays.stringProgram;

import java.util.Arrays;

public class HoldInIntergerArray {
	public static void main(String[] args) {
		String s = "soura123bh";

		String result = "";

		char[] ch = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(ch[i])) {
				result  = result+ ch[i];
				System.out.println();
			}
		}

		// Convert numeric result string to int array
		int[] intArray = new int[result.length()];
		for (int i = 0; i < result.length(); i++) {
			intArray[i] = Character.getNumericValue(result.charAt(i));
		}

		//System.out.println(intArray[i]);
		System.out.println(Arrays.toString(intArray));
	}
}