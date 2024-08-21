package com.rays.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet set = new HashSet();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(500);

		System.out.println("set.contains(200) : "+set.contains(200));
		System.out.println("set.isEmpty() : "+set.isEmpty());
		System.out.println("set.size() : "+set.size());
		System.out.println("set.remove(500) : "+set.remove(500));
		set.clear();
		System.out.println("------------");
		
		
		TreeSet tSet = new TreeSet();
		
		tSet.add(100);
		tSet.add(200);
		tSet.add(300);
		tSet.add(400);
		tSet.add(500);

		System.out.println("tSet.ceiling(10) : "+tSet.ceiling(10));//provide greater or equal || provide null if not greater available
		System.out.println("tSet.contains(12) : "+tSet.contains(12));
		System.out.println("tSet.first() : "+tSet.first());
		System.out.println("tSet.pollFirst() : "+tSet.pollFirst());
		System.out.println("tSet.lower(400) : "+tSet.lower(400));
		System.out.println(tSet);
		System.out.println("tSet.higher(500) : "+tSet.higher(500));
		System.out.println("tSet.size() : "+tSet.size());
		System.out.println(tSet);
		System.out.println("-----------");
		

		LinkedHashSet set1 = new LinkedHashSet();
		
		set1.add(100);
		set1.add(200);
		set1.add(300);
		set1.add(400);
		set1.add(500);

		System.out.println("set1.contains(200) : "+set1.contains(200));
		System.out.println("set1.isEmpty() : "+set1.isEmpty());
		System.out.println("set1.size() : "+set1.size());
		System.out.println("set1.remove(155) : "+set1.remove(155));
		System.out.println("set1.hashCode() : "+set1.hashCode());
		System.out.println("set1.toArray() : "+set1.toArray());
	
		
	}

}