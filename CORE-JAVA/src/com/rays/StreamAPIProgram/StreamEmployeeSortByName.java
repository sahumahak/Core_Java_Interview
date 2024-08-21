package com.rays.StreamAPIProgram;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEmployeeSortByName {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(2, "Anshul"));
		list.add(new Employee(4, "Shyam"));
		list.add(new Employee(3, "Ram"));
		list.add(new Employee(1, "Mohit"));

		list.stream().sorted(Comparator.comparing(Employee::getName))
				.forEach(e -> System.out.println(e.getId() + " " + e.getName()));

	}

}
