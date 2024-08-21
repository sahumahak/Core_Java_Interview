package com.rays.IOProgram;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class WriteAndReadTextFileExample {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		FileWriter fw = new FileWriter("C:/mahak/mahakk.txt", true);

		 PrintWriter pw = new PrintWriter(fw);
		System.out.println("enter here....");

		String str = br.readLine();

		while (str != null) {

			pw.write(str);

			System.out.println(str);

			str = br.readLine();

		}

		br.close();
	}

}
