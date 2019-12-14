package application;

import java.util.Scanner;

/*
 * Create a program that asks for the user's password.
 * 
 * If they type the correct password, print 'Access granted' 
 * and end the program.
 * 
 * If they type the wrong password, print 'Incorrect password.', 
 * and ask for the password again.
 * 
 * If they type the wrong password three times, print 'Access denied' 
 * and end the program.
 * 
 * Hints: use a 'for' loop and the 'break' keyword.
 * You can use a boolean flag.
 * Do not use System.exit().
 */

public class App {

	public static void main(String[] args) {
		
		final String USER_PASSWORD = "hello";
		
		Scanner scanner = new Scanner(System.in);
		
		boolean accessGranted = false;
		
		for(int i=0; i<3; i++) {
			System.out.print("Enter password > ");
			String input = scanner.nextLine();
			
			if(input.equals(USER_PASSWORD)) {
				System.out.println("Access granted.");
				accessGranted = true;
				break;
			}
			else {
				System.out.println("Incorrect password.");
			}
		}
		
		scanner.close();
		
		if(!accessGranted) {
			System.out.println("Access denied.");
		}

	}

}







