package com.rays.Collection.Comparater;

public class Student {

	public int id;
	public String name;
	public int salary;


	public Student(int id ,String name,int salary) {
		this.id= id;
		this.name= name;
		this.salary=salary;
		
	}


	@Override
	 public String toString() {
        return (id + " " + name + " " + salary);
    }
}