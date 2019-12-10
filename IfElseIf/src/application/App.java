package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		

		System.out.println("Menu");
		System.out.println("====");
		
		System.out.println("\t1. Print 'hello'");
		System.out.println("\t2. Exit program");
		System.out.println();
		System.out.print("Enter an option > ");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();
		
		if(input == 1) {
			System.out.println("Hello");
		}
		else if(input == 2) {
			System.out.println("Exiting ...");
		}
		else if(input == 3) {
			System.out.println("Exiting ...");
		}
		else {
			System.out.println("Invalid option.");
		}

		
		
		
	}

}
