package com.rays.Collection.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("Arun");
        v.addElement("Mahak");
        v.addElement(100);
        v.addElement(200);

        System.out.println(v);

        Iterator it = v.iterator();
        //   v.addElement(1);
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("------------------");

        Enumeration e = v.elements();
        v.addElement(1);
        v.addElement(2);

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        System.out.println("------------------");
        System.out.println(v);
        v.set(5, 500);
        System.out.println(v);
        v.add(2, "Amisha");
        System.out.println(v);
    }
}
