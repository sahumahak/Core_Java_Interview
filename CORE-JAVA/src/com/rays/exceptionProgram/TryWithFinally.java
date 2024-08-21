package com.rays.exceptionProgram;

public class TryWithFinally {

	public static void main(String[] args) {

		String s = "Mahak";
		try {

			s.charAt(3);
			System.out.println("try");
			
		} finally {
			System.out.println("end of program");
		}

	}
}