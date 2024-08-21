package com.rays.StreamAPIProgram;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class cvg {
	public static void main(String[] args) {
		
	

	Collection<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");
	 
	// Get collection without duplicate i.e. distinct only
	List<String> l = list.stream().distinct().collect(Collectors.toList());
	 
	//Let's verify distinct elements
	System.out.println(l);


}
}