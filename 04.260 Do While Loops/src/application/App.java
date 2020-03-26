package application;

public class App {

	public static void main(String[] args) {

		int count = 0;
		
		System.out.println("First loop: ");

		do {
			System.out.println("Count: " + count);
		} while (count++ < 5);
		
		
		System.out.println("Second loop:");

		count = 0;
		
		do {
			System.out.println("Count: " + count);
			count++;
		} while (count < 3);

	}

}
