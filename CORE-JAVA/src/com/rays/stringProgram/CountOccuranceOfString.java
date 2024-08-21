package com.rays.stringProgram;

public class CountOccuranceOfString {

	public static void main(String[] args) {

		String name = "Mahak";
		String str = name.toLowerCase();
		int count = 0;

		for (char a = 'a'; a <= 'z'; a++) {
			for (int i = 0; i < str.length(); i++) {
				if (a == str.charAt(i)) {

					count++;

				}
			}

			if (count!= 0) { 
			//	if (count == 0) {

				System.out.println(a + " " + count);

				count = 0;

			}

		}

	}

}
