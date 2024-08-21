package com.rays.IOProgram;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudentExternalizable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		StudentExternalizable s = new StudentExternalizable(1, "Mahak");

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:/mahak/students.txt"));

		out.writeObject(s);

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/mahak/students.txt"));

		s = (StudentExternalizable) in.readObject();

		System.out.println(s.getId());
		System.out.println(s.getName());

		out.close();
		in.close();

	}

}
