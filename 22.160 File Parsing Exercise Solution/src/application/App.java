package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		String filePath = "/Users/caveofprogramming/courses/Java Beginners/java-beginners-11/ReactionTimes/reactiontimes.csv";

		try (var br = new BufferedReader(new FileReader(filePath))) {

			String line;
			
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			int total = 0;
			int lineNumber = 0;

			while ((line = br.readLine()) != null) {
				String[] fields = line.split(",");

				if (fields.length != 3) {
					System.err.println("Line doesn't contain 3 fields: " + line);
					continue;
				}

				int reactionTime = 0;

				try {
					reactionTime = Integer.parseInt(fields[2]);
				} catch (NumberFormatException e) {
					System.out.println("Number badly formatted in file: " + fields[2] + " on line " + lineNumber);
					continue; // Forgot to add this in the video. No point trying to add up useless values.
				}
				
				if(reactionTime < min) {
					min = reactionTime;
				}
				
				if(reactionTime > max) {
					max = reactionTime;
				}
				
				total += reactionTime;
				
				lineNumber++;
			}
			
			if(lineNumber == 0) {
				System.out.println("No lines in file.");
				return;
			}
			
			System.out.println("Min: " + min + " ms");
			System.out.println("Max: " + max + " ms");
			System.out.println("Average: " + (double)total/lineNumber + " ms");

		} catch (NumberFormatException e) {

		} catch (FileNotFoundException e) {
			System.out.println("Cannot open " + filePath);
		} catch (IOException e) {
			System.out.println("Cannot read " + filePath);
		}

	}

}
