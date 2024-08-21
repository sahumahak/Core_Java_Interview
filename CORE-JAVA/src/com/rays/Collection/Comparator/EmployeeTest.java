package com.rays.Collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import com.rays.Collection.Comparater.EmployeeShortByName;
import com.rays.Collection.Comparater.EmployeeShortBySalary;

public class EmployeeTest{

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		list.add(new Employee(1, "Mahak", 5000));
		list.add(new Employee(4, "Ishika", 5000));
		list.add(new Employee(2, "Nayna", 8000));
		list.add(new Employee(3, "Yashita", 4000));


			SortByName sbn = new SortByName();
	        Collections.sort(list, sbn);
	        System.out.println("SortByName>>>");
//	        l.forEach(System.out::println);
	        Iterator it = list.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }
	        System.out.println("-------------");
	        
	        SortById sbi = new SortById();
	        Collections.sort(list, sbi);
	        System.out.println("SortById>>>");
	        Iterator i = list.iterator();
	        while (i.hasNext()) {
	            System.out.println(i.next());
	        }
	        
	        System.out.println("-------------");
	        
	 		SortBySalary sbs = new SortBySalary();
	 		Collections.sort(list, sbs);
	 		System.out.println("SortBySalary>>>");
	 		Iterator itr = list.iterator();
	        while (itr.hasNext()) {
	            System.out.println(itr.next());
	        }
//		ArrayList list = new ArrayList();
//		list.add(c1);
//		list.add(c2);
//		list.add(c3);
//
//		Collections.sort(list, new SortByName());
//		Collections.sort(list, new SortById());
//		Collections.sort(list, new SortBySalary());
//		
//		for(Object o :list) {
//			System.out.println(o);

}     
		
	}
