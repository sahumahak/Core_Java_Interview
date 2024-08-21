package com.rays.oopProgram;

public class MethodOverloadings {

	public void move(int num) {
		System.out.println("first number is " + num);

	}

	public void move(int num, int num1) {
		System.out.println(num + num1);

	}

	public static void main(String[] args) {
		MethodOverloadings m = new MethodOverloadings();

		m.move(5);
		m.move(5, 10);
	}

}