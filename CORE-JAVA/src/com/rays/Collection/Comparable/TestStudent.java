package com.rays.Collection.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        List l = new ArrayList();

        l.add(new Student("Mahak", 1));
        l.add(new Student("Neha", 2));
        l.add(new Student("Ishika", 5));
        l.add(new Student("Neha", 1));

        Collections.sort(l);

        Iterator it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

//        l.forEach(System.out::println);
    }
}
