package com.rays.stringProgram;

public class ExtractDuplicateCharInString {

	public static void main(String[] args) {

		String str = "Mahakk";

		int count = 0;
		char[] ch = str.toCharArray();

		

		for (int i = 0; i < ch.length; i++) {
			count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '0';

				}

			}
			if (count > 1 && ch[i] != '0') {
				System.out.print(ch[i]);

			}

		}

	}

}
