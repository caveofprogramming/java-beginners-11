package application;

public class Person {
	public void greet() {
		System.out.println("Hello");
	}

	public void greet(String nameToGreet) {
		System.out.println("Hello " + nameToGreet);
	}

	public void greet(int height) {

		if (height > 185) {
			System.out.print("You are very tall! ");
		}

		System.out.println("Hello");
	}

	public void greet(String name, int height) {

		if (height > 185) {
			System.out.print("You are very tall! ");
		}

		System.out.println("Hello " + name);
	}
}
