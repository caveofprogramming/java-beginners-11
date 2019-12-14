package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		final String USER_PASSWORD = "hello";
		
		Scanner scanner = new Scanner(System.in);
		
		String password = null;
		
		do {
			
			System.out.print("Enter password > ");
			password = scanner.nextLine();
			
		} while(!password.equals(USER_PASSWORD));
		
		scanner.close();
		
		System.out.println("Access granted.");
		
	}

}
