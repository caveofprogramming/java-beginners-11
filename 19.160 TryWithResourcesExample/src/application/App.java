package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter an integer > ");
			
			int value = scanner.nextInt();
			
			System.out.println("Value: " + value);
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid input");
		}
		


	}

}
