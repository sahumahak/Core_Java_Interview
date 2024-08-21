package com.rays.oopProgram;

public class Studentt { //ConstructorOverLoading
	 
		//instance variables of the class  
		int id;  
		String name;  
		  
		Studentt(){  
		System.out.println("this a default constructor");  
		}  
		  
		Studentt(int i, String n){  
		id = i;  
		name = n;  
		}  
		  
		public static void main(String[] args) {  
		//object creation  
		Studentt s = new Studentt();  
		System.out.println("\nDefault Constructor values: \n");  
		System.out.println("Student Id : "+s.id + "\nStudent Name : "+s.name);  
		  
		System.out.println("\nParameterized Constructor values: \n");  
		Studentt student = new Studentt(10, "David");  
		System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name);  
		}  
		

}
