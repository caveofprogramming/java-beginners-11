package application;

public class App {

	public static void main(String[] args) {
		new App().run(4, "hello", "how", "are", "you");
	}

	public void run(int value, String... texts) {
		
		System.out.println(value);
		
		for(var t: texts) {
			System.out.println(t);
		}
	}

}
