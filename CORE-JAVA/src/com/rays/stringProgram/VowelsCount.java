package com.rays.stringProgram;

public class VowelsCount {

	public static void main(String[] args) {

		String name = "Google";
		int count = 0;

		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				count++;

			}

		}
		System.out.println(count);

		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);

			if ("aeiouAEIOU".indexOf(c) != -1) {
				System.out.println(c);

			}

		}

	}

}
