package com.rays.Collections;
import java.util.HashMap;
import java.util.Map;

import com.rays.Collection.Comparater.Student;

public class EqualHashMap {
	
	public static void main(String[] args) {
		
		Student s1 = new Student (1 , "Neha", 10000);
		Student s2 = new Student  (1 ,"Neha", 10000);
		
		
		Map m = new HashMap();
		m.put(s1 , "One");
		m.put (s2,"two");
		
		System.out.println(m);
	}

}
