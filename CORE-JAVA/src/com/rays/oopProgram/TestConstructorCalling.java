package com.rays.oopProgram;

public class TestConstructorCalling extends ConstructorCalling {

	public TestConstructorCalling(String fname, String lname, String address) {
		super(fname, lname, address);

	}

	public static void main(String[] args) {
		TestConstructorCalling t = new TestConstructorCalling("Mahak", "Sahu", "Indore");
		//System.out.println(t);
	}

}
