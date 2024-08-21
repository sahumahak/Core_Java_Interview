package com.rays.basicProgram;
import java.io.*;

public class Deserialization implements Serializable  {
	    public void display() {
	        System.out.println("Object created using deserialization");
	    }

	    public static void main(String[] args) {
	        try {
	            // Serialize the object
	        	Deserialization original = new Deserialization();
	            FileOutputStream fos = new FileOutputStream("example.ser");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(original);
	            oos.close();

	            // Deserialize the object
	            FileInputStream fis = new FileInputStream("example.ser");
	            ObjectInputStream ois = new ObjectInputStream(fis);
	            Deserialization deserialized = (Deserialization) ois.readObject();
	            ois.close();

	            deserialized.display();
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        
	    }
	}

}
