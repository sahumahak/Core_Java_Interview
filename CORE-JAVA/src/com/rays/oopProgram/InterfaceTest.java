package com.rays.oopProgram;

public class InterfaceTest implements Interfacee {

	@Override
	public int sum(int a, int b) {
		return a+b;
	}


	public static void main(String[] args) {
		
		InterfaceTest b = new InterfaceTest();
		
		int i = b.sum(x, 30);

		System.out.println(i);
	}
}