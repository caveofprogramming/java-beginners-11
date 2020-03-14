package app;

@FunctionalInterface
interface Runner {
	void execute(String greeting, String name);
}

public class App {

	public static void main(String[] args) {
	
		Runner run = (g,n) -> System.out.println(g + " " + n);

		greet(run);
	}
	
	public static void greet(Runner runner) {
		runner.execute("Hello", "Zed");
	}

}
