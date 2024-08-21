package com.rays.exceptionProgram;

public class TryWithMultiCatchFInally {
    public static void main(String[] args) {
        String s = "Mahak";
        try {
        	int a = 10/0;
            System.out.println(s.length());
            System.out.println(s.charAt(8));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block");
        }
    }
}