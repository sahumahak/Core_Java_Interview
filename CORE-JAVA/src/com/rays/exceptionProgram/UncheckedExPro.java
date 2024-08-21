package com.rays.exceptionProgram;

public class UncheckedExPro extends RuntimeException {
    public UncheckedExPro() {
        super("Raised by son ,Caught by Dad");
    }
}