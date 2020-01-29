package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number > ");
		String line = scanner.nextLine();
		
		int value = 0;
		
		try {
			value = Integer.parseInt(line);
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid number");
		}
			
		System.out.println("You entered: " + value);
		
		scanner.close();
	}

}
