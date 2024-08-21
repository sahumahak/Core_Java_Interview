package com.rays.exceptionProgram;

public class SystemExit {
    public static void main(String[] args) {
        int a = 8;
        try {
            int c=a/2;
            System.out.println(c);
            System.exit(0);
        }catch (Exception e){
            System.out.println("It is AE");
            
        }finally {
            System.out.println("Finally");
        }
    }
}

