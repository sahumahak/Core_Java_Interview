package com.rays.exceptionProgram;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		try {

			String str = null;
			System.out.println(str.length()); // This will throw a NullPointerException

		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
	}
}