package com.rays.Collection.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add("Welcome");
        set.add("To");
        set.add("Geeks");
        set.add("Geeks");

        System.out.println(set);

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
