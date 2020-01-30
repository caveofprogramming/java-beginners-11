package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
	
		File textFile = new File("temps.csv");

		try(BufferedReader br = new BufferedReader(new FileReader(textFile))) {
			String line = null;

			while ((line = br.readLine()) != null) {
				System.out.println("'" + line + "'");
				
				String[] fields = line.split(";");
				
				for(String f: fields) {
					System.out.println(f);
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + textFile.getAbsolutePath());

		} catch (IOException e) {
			System.out.println("Error reading file: " + textFile.getAbsolutePath());
		} 
		
		

		
	}

}
