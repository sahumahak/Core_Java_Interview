package com.rays.stringProgram;

public class ExtractVowels {

	public static void main(String[] args) {

		String name = "aseliuriuiwrvjnckj";
		//String str = str1.toLowerCase();
		int count = 0;

		for (int i = 0; i < name.length(); i++) {

			char c = name.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				count++;
			}

			if ("aeiouAEIOU".indexOf(c) != -1) {
				System.out.print(c);
			}
		}
		System.out.print(" No of Vowels :" + count);

	}
}
