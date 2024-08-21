package com.rays.IOProgram;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class EmailReadWrite {

	public static void main(String[] args) throws Exception {

		FileReader read = new FileReader("C://mahak//Email.txt");

		BufferedReader in = new BufferedReader(read);

		FileWriter write = new FileWriter("C://mahak//BlankEmail.txt");

		PrintWriter out = new PrintWriter(write);

		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		String str = in.readLine();

		while (str != null) {

			if (str.matches(emailreg)) {

				out.print(str);

			}

			str = in.readLine();

		}

		out.close();
		in.close();
		System.out.println("done");

	}

}