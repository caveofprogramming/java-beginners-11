package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		final String USER_PASSWORD = "hello";
		
		System.out.print("Enter password > ");
		
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
		scanner.close();
		
		if(password.equals(USER_PASSWORD)) {
			System.out.println("Access granted.");
		}
		else {
			System.out.println("Access denied.");
		}

	}

}
