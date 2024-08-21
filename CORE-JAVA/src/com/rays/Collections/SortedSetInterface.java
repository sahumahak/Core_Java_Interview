package com.rays.Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface {

	public static void main(String[] args) {

		SortedSet tSet = new TreeSet();
		

		tSet.add(100);
		tSet.add(200);
		tSet.add(500);
		tSet.add(400);
		tSet.add(300);
		//tSet.add("abc");

	//	System.out.println("tSet.ceiling(122) : "+((TreeSet) tSet).ceiling(122));
	//	System.out.println("tSet.contains(12) : "+tSet.contains(12));
	//	System.out.println("tSet.pollFirst() : "+((TreeSet) tSet).pollFirst());
	//	System.out.println("tSet.subSet(121, 124) : "+tSet.subSet(121, 124));
		
		
		System.out.println("tSet.first() : "+tSet.first());
		System.out.println("tSet.last() : "+tSet.last());
		System.out.println("tSet.size() : "+tSet.size());
		System.out.println("tSet.tailSet(200) : "+tSet.tailSet(200));
		System.out.println("tSet.headSet(400) : "+tSet.headSet(400));
		
	}

}