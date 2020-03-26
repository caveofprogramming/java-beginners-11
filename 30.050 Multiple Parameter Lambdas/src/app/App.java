package app;

@FunctionalInterface
interface Runner {
	void execute(String text);
}

public class App {

	public static void main(String[] args) {

		Runner run1 = (String text) -> {
			System.out.println(text);
		};

		run1.execute("hi there");

		Runner run2 = (s) -> {
			System.out.println(s);
		};

		run2.execute("hi there");

		Runner run3 = s -> {
			System.out.println(s);
		};

		run3.execute("hi there");

		Runner run4 = s -> System.out.println(s);

		run4.execute("hi there");

	}

}
