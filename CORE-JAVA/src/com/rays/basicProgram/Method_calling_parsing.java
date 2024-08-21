package com.rays.basicProgram;

public class Method_calling_parsing {
	
	public static void main(String[] args){
		int a = Integer.parseInt("20");
		int b = Integer.parseInt("10");
		
		adding(a,b);
		subtracting(a,b);
		multiplication(a,b);
		division(a,b);
		
    }
	public static void adding(int a, int b){
	  int c = a+b;
	  System.out.println(c);
	}
	public static void subtracting(int a, int b){
	  int c = a-b;;
	  System.out.println(c);
	}
	public static void multiplication(int a, int b){
		int c = a*b;
		System.out.println(c);
	}
	public static void division(int a, int b){
		int c = a/b;
		System.out.println(c);
	}

}