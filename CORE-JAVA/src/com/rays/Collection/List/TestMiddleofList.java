package com.rays.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class TestMiddleofList {
    public static void main(String[] args) {
        List l = new ArrayList();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        System.out.println(l.get((l.size() - 1) / 2));
    }
}
