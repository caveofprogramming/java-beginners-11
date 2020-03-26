package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Menu");
		System.out.println("====");
		System.out.println();
		System.out.println("1. Print 'hello'");
		System.out.println("2. Print 'How are you?'");
		System.out.println("3. Exit program");
		System.out.println();
		System.out.print("Enter an option > ");

		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();

		if (input == 1) {
			System.out.println("Hello");
		} else if (input == 2) {
			System.out.println("How are you?");
		} else if (input == 3) {
			System.out.println("Exiting ...");
			System.exit(0);
		} else if (input > 100) {
			System.out.println("You've found the hidden Easter egg");
		}
		else {
			System.out.println("Invalid option.");
		}
	}

}
