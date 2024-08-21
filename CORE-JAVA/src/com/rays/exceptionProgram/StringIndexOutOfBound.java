package com.rays.exceptionProgram;

public class StringIndexOutOfBound {
    public static void main(String[] args) {
        String s = "mahak";
        try {
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(8));
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("exception");
        }
    }
}