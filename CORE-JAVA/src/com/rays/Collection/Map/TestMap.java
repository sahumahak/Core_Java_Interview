package com.rays.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(6, 1);
        map.put(5, 3);

        System.out.println(map);

        //  map.clear();
        map.remove(1);
        System.out.println(map);
        System.out.println(map.keySet());
        // Retrieve and print values based on keys
        System.out.println(map.get(7));

        // Check if a key is present in the map
        System.out.println(map.containsKey(7));

        System.out.println(map.entrySet());         //for Iterate the map
        System.out.println(map.values());
        System.out.println(map.size());
        System.out.println(map.keySet());           // get all keys

    }
}
