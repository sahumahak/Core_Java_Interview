package com.rays.stringProgram;

public class ReverseString {

	public static void main(String[] args) {

		String name = "Mahak Sahu";

//		for (int i = name.length() - 1; i >= 0; i--) {
//
//			System.out.print(name.charAt(i));
//
//		}
//
//		System.out.println(" ");

		char[] ch = name.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {

			System.out.print(ch[i]);

		}

	}

}
