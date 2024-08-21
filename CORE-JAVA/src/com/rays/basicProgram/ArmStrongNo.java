package com.rays.basicProgram;

public class ArmStrongNo {

	public static void main(String[] args) {

		int num = 153;
		int temp = 0;
		int num2 = num;
		int r = 0;

		while (num2 != 0) {

			r = num2 % 10;
			//System.out.println("r="+r);
			temp = temp + r * r * r;
			//System.out.println("temp="+temp);
			num2 = num2 / 10;
			//System.out.println(num2);

		}

		if (temp == num) {

			System.out.println("ArmStrongNo");

		} else {
			System.out.println("Not ArmStrongNo");
		}

	}

}
