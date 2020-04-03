package application;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class App1 {
	public static void main(String[] args) {
	
		String pathString = "test.bin";
		
		Serializable[] people = new Serializable[2];
		
		people[0] = new Person("Joe", 1);
		people[1] = new Person("Sue", 2);

		try (var os = new ObjectOutputStream(new FileOutputStream(pathString))) {
			os.writeObject(people);
		} catch (FileNotFoundException e) {
			System.out.println("Cannot create file: " + pathString);
		} catch (IOException e) {
			System.out.println("Cannot write file: " + pathString);
		}

		System.out.println("Completed. " + pathString + " created.");
	}
}
