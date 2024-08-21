package com.rays.basicProgram;
import java.lang.reflect.Constructor;


public class Reflection {
	public void display() {
	   System.out.println("Object created using Constructor.newInstance()");
	    }

	    public static void main(String[] args) {
	        try {
	            Constructor<Reflection> constructor = Reflection.class.getDeclaredConstructor();
	            Reflection example = constructor.newInstance();
	            example.display();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    
	}
}
