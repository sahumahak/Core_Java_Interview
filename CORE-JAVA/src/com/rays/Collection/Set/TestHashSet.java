package com.rays.Collection.Set;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet s = new HashSet();
        
        s.add("Krishna");
        s.add("mahak");
        s.add("ishika");
        s.add("Neha");
        s.add("mahak");
        

 //       System.out.println("HashSet1 = " + s);
        Iterator it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

//        HashSet s2 = new HashSet();
//
//        s2.add(1);
//        s2.add(5);
//        s2.add(0);
//        s2.add(3);
//        s2.add(2);

//        System.out.println("HashSet2 = " + s2);
//        System.out.println(s2.contains(2));
//        s2.remove(4);
//        System.out.println(s2);
//        System.out.println(s2.size());

//        Iterator it1 = s2.iterator();
//        // s2.add(8);  //ConcurrentModificationException
//        while (it1.hasNext()) {
//            System.out.println(it1.next());
//        }
//        s2.add(4);
//        System.out.println(s2);
    }
}
