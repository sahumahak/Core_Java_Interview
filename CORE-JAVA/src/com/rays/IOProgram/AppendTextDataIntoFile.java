package com.rays.IOProgram;

import java.io.FileWriter;
import java.io.IOException;

public class AppendTextDataIntoFile {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C:/mahak/io.txt", true);

		fw.write(" Indore");

		System.out.println("address added...");

		fw.close();

	}

}
