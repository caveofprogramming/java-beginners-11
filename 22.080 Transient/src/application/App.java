package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	private String name;
	private transient Integer id;
	
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	
	
}

public class App {
	public static void main(String[] args) {
		Person p1 = new Person("Joe", 1);
		
		String pathString = "test.bin";
		
		try(var os = new ObjectOutputStream(new FileOutputStream(pathString))) {
			os.writeObject(p1);
		}
		catch(FileNotFoundException e) {
			System.out.println("Cannot create file: " + pathString);
		}
		catch(IOException e) {
			System.out.println("Cannot write file: " + pathString);
		}
		
		System.out.println("Completed. " + pathString + " created." );
		
		try(var os = new ObjectInputStream(new FileInputStream(pathString))) {
			Person p = (Person)os.readObject();
			
			System.out.println(p);
		}
		catch(FileNotFoundException e) {
			System.out.println("Cannot open file: " + pathString);
		}
		catch(IOException e) {
			System.out.println("Cannot read file: " + pathString);
		} catch (ClassNotFoundException e) {
			System.out.println("Cannot read object from file: " + pathString);
		}
	}
}
