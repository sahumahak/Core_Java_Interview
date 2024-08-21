package com.rays.stringProgram;

public class PalindromString {
	public static void main(String[] args) {
		String name="rotator";
		boolean flag=true;
		
		for(int i=0;i<name.length()/2;i++) {
			if(name.charAt(i)!=name.charAt(name.length()-i-1)) {
				flag=false;
			}
			else {
				flag=true;
			}
		}
		
		System.out.println("palindrom = "+flag);
	}

}





