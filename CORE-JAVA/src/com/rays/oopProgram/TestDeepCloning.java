package com.rays.oopProgram;

public class TestDeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee1 e = new Employee1("Mahak");

		Employee1 e2 = (Employee1) e.clone();

		e2.name = "Anjali";
		e2.address.city = "Bhopal";
	
		System.out.println(e.name);
		System.out.println(e.address.city);
		System.out.println(e2.name);
		System.out.println(e2.address.city);

	}

}
