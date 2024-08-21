package com.rays.oopProgram;

public class Test {
	
	Test(int a){
		System.out.println("Parametrized Constructor");
	}
	
	//int i;
	//String s;
	public static void main(String[] args) {
		
		Test t = new Test(10); 
	//	System.out.println(t.i +" "+ t.s);
	}

}
