package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;

public class App2 {

	public static void main(String[] args) {
		String pathString = "test.bin";
		
		try (var os = new ObjectInputStream(new FileInputStream(pathString))) {
			Person p = (Person) os.readObject();

			System.out.println(p);
		} catch (FileNotFoundException e) {
			System.out.println("Cannot open file: " + pathString);
		} 
		catch(InvalidClassException e) {
			System.out.println("Incompatiable software versions.");
		}
		catch (IOException e) {
			System.out.println("Cannot read file: " + pathString);
		} catch (ClassNotFoundException e) {
			System.out.println("Cannot read object from file: " + pathString);
		}
	}

}
