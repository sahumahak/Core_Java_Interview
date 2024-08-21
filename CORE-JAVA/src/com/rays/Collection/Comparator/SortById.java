package com.rays.Collection.Comparator;

import java.util.Comparator;

public class SortById implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.id-o2.id;
	}
	
}