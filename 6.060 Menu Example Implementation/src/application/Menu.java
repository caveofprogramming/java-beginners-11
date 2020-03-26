package application;

public class Menu {

	String[] options = { "Add an item", "View items", "Delete an item", "Quit the program" };

	void display() {

		System.out.println("Choose an option:");

		for (int i = 0; i < options.length; i++) {
			System.out.printf(" %d. %s\n", i, options[i]);
		}
	}
}
