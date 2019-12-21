package application;
/*
 * Output something like this:
 * 
 * Options:
 * 1. View database
 * 2. Add new item
 * 3. Delete item
 * 4. Quit program
 * 
 * Store the menu options in an array.
 * The array should be the instance variable of a class "Menu"
 * To output the menu, call a method called "display()".
 * 
 * Steps:
 * 
 * 1. Create a class with a main method as usual.
 * 2. Create a class called Menu.
 * 3. Give the Menu class an instance variable, which is an array of strings,
 * containing the options: "View database", "Add new item", etc.
 * 4. Give the Menu class a method called display()
 * 5. In your main method, create an object of type Menu, then call its display() method.
 * 6. Implement code in display(), using a loop, that prints the menu.
 */

public class App {

	public static void main(String[] args) {
		Menu optionsMenu = new Menu();

		optionsMenu.display();
	}

}
