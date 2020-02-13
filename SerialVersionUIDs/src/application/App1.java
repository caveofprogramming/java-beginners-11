package application;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class App1 {
	public static void main(String[] args) {
		Person p1 = new Person("Joe", 1);

		String pathString = "test.bin";

		try (var os = new ObjectOutputStream(new FileOutputStream(pathString))) {
			os.writeObject(p1);
		} catch (FileNotFoundException e) {
			System.out.println("Cannot create file: " + pathString);
		} catch (IOException e) {
			System.out.println("Cannot write file: " + pathString);
		}

		System.out.println("Completed. " + pathString + " created.");
	}
}
