package com.rays.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestCollection {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add('a');

        Collection c2 = new ArrayList();
        c2.add('a');
        c2.add('b');
        c2.add('c');
        c2.add('d');

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        //  c1.retainAll(c2);

        System.out.println("c1 => " + c1);
        System.out.println("c2 => " + c2);

        System.out.println("=====================================");
        c1.add('b');
        System.out.println("c1 = " + c1);
        c1.addAll(c2);
        System.out.println("c1 = " + c1);
        c1.remove('d');
        System.out.println("c1 = " + c1);

//        c1.clear();
//        System.out.println("c1 = " + c1);

        System.out.println(c1.contains('a') + " Mahak");
        System.out.println(c1.containsAll(c2));
        System.out.println(c1.isEmpty());
        c1.removeAll(c2);
        System.out.println("c1 = " + c1);
        System.out.println("c1 size = " + c1.size());
    }
}
