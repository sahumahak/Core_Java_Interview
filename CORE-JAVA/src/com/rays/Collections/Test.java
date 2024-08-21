package com.rays.Collections;

public class Test {

	public static void main(String[] args) {
 
		Demo d1 = new Demo(1, "Mahak", 1000);
		 //Demo d2 = null;
		Demo d2 = new Demo(1, "Mahak", 1000);
		
		//Test t = new Test();
		
//		System.out.println(d1.hashCode());
//		System.out.println(d2.hashCode());
		
		if(d1.equals(d2)) {
			if(d1.hashCode()==d2.hashCode()) {
			System.out.println("Equal");
		}
	}else {
		System.out.println("Not Equal");
	}
}
}