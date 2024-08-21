package com.rays.IOProgram;

import java.io.FileReader;
import java.io.IOException;

public class ReadCharByCharText {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C://mahak//io.txt");

		int i = fr.read();

		while (i != -1) {

			System.out.print((char) i);

			i = fr.read();

		}

		fr .close();

	}

}
