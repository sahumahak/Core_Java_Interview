package com.rays.basicProgram;

public class Exampleeee implements Cloneable {
	    public void display() {
	        System.out.println("Object created using clone()");
	    }

	    @Override
	    protected Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }

	    public static void main(String[] args) {
	        try {
	            Exampleeee original = new Exampleeee();
	            Exampleeee clone = (Exampleeee) original.clone();
	            clone.display();
	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
	    }
	}