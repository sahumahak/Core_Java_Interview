package com.rays.Collection;

public class EqualHashCodeTest {
    public static void main(String[] args) {
        EqualHashCode e1 = new EqualHashCode(100, "Arun", "500");
        EqualHashCode e2 = new EqualHashCode(100, "Arun", "500");

//        if (e1.equals(e2)) {
//            if (e1.hashCode() == e2.hashCode()) {
//                System.out.println("Equals");
//            }
//        } else {
//            System.out.println("Not Equals");
//        }

        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
}
