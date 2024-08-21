package com.rays.exceptionProgram;

public class ArrayIndexOutOfBound {
	    public static void main(String[] args) {
	        String[] a = {"Raj", "mahak", "ishika"};
	        try {
	            for (int i = 0; i < a.length; i++) {
	                System.out.println(a[8]);
	            }
	        } catch (ArrayIndexOutOfBoundsException e) {
	            e.printStackTrace();
	            System.out.println(e.getMessage());
	        
	    }
	}

}
