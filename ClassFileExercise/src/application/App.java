package application;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		
		String classFile = "/Users/caveofprogramming/courses/Java Beginners/java-beginners-11/ClassFileExercise/bin/application/App.class";
		
		File file = new File(classFile);
		
		if(!file.exists()) {
			System.out.println("File does not exist: " + classFile);
		}
		
		try(var dis = new DataInputStream(new FileInputStream(file))) {
			
			int magicNumber = dis.readInt();
			
			System.out.printf("%x\n", magicNumber);
			
			int minorVersion = dis.readUnsignedShort();
			int majorVersion = dis.readUnsignedShort();
			
			System.out.println(majorVersion + ", " + minorVersion);
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Completed");
	}

}
