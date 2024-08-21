package com.rays.Collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortedMap tMap = new TreeMap();
		

		tMap.put(1, "One");
		tMap.put(2, "Two");
		tMap.put(3, "Three");
		tMap.put(4, "Four");
		tMap.put(5, "Five");
		
		
		System.out.println("tMap.lastKey() : "+tMap.lastKey());
		System.out.println("tMap.firstKey() : "+tMap.firstKey());
		System.out.println("tMap.entrySet() : "+tMap.entrySet());
		System.out.println("tMap.tailMap(3) : "+tMap.tailMap(3));
		System.out.println("tMap.subMap(2, 4) : "+tMap.subMap(2, 4));
		
		
	}

}