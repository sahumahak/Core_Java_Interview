package com.rays.Collections;

import java.util.HashMap;
import java.util.Set;

public class MapEntrySet {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put("1", "one");
		map.put("2", "two");
		map.put("3", "three");

			//map.entrySet();

		for (Object object : map.keySet()) {
			System.out.println(object);
		}
		
		for (Object object : map.values()) {
			System.out.println(object);
		}

		
	}
}