package com.rays.basicProgram;

public class PelindromeNo {

	public static void main(String[] args) {

		int num = 131;
		int temp = 0;
		int num2 = num;
		int r = 0;

		while (num2 != 0) {

			r = num2 % 10;
			//System.out.println("r="+r);
			temp = (temp * 10) + r;
			//System.out.println("temp="+temp);
			num2 = num2 / 10;
			//System.out.println("num2="+num2);

		}
		//System.out.println("reverse no. " + sum);
		if (temp == num) {
			System.out.println("This is Pelindrome");
		} else {
			System.out.println("This is not Pelindrome");
		}

	}

}
