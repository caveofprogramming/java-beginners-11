package application;

import java.util.Scanner;

public class App {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int number = getNumber();
		System.out.println("You entered: " + number);
		scanner.close();
	}

	private static int getNumber() {

		boolean gotNumber = false;
		int value = 0;

		do {
			System.out.println("Enter a number > ");
			String line = scanner.nextLine();

			try {
				value = Integer.parseInt(line);
				gotNumber = true;
			} catch (NumberFormatException e) {
				System.out.println("Invalid number");
			}

		} while (!gotNumber);
		
		return value;

	}

}
