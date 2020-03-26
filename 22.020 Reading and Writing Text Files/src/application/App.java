package application;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		File currentDirectory = new File(".");
		
		System.out.println(currentDirectory.getCanonicalPath());
		
		for(String f: currentDirectory.list()) {
			System.out.println(f);
		}

	}

}
