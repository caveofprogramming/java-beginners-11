package application;

public class App {

	public static void main(String[] args) {

		int count = 0;

		while (true) {
			System.out.println("Hello. " + count);

			if (count == 5) {
				break;
			}

			System.out.println("How are you.");

			count++;
		}

		System.out.println("Program finished.");
	}

}
