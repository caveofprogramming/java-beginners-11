package application;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		
		String fileLocation = "/Users/caveofprogramming/courses/Java Beginners/java-beginners-11/FileLocations/test.txt";
		
		System.out.println(new File(fileLocation).exists());
		
	}

}
