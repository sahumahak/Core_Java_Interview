package com.rays.Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("Mahak",1);
        m.put("Ishika",2);
        m.put("Neha",3);
        m.put("Mahak",100);

//        System.out.println(m.size());
//        System.out.println(m);
//        System.out.println(m.get(3));

        for (Object o : m.entrySet()) {
            System.out.println();
        }
    }
}
