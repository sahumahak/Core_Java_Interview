package com.rays.exceptionProgram;

public class NumberFormatExce {
	
    public static void main(String[] args) {
	        String s="Mahak12";
	        try {
	            int i=Integer.parseInt(s);
	        }catch (NumberFormatException e){
	            System.out.println(e);
	        }
	    }
	}

