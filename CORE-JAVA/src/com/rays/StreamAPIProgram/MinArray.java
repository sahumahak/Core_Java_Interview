package com.rays.StreamAPIProgram;

import java.util.Arrays;
import java.util.OptionalInt;

public class MinArray {
	public static void main(String[] args) {
		int[] i = { 1, 2, 3, 8, 5 };

		Arrays.stream(i).min().ifPresent(e -> {
			System.out.println("MinArray= "+ e);
		});     //For extract Min
		Arrays.stream(i).max().ifPresent(e -> {
			System.out.println(e);
		});         //For extract Max
	}
}