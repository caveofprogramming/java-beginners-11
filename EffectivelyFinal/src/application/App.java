package application;

public class App {
	
	private int count = 1;

	public static void main(String[] args) {
		new App().run();
	}
	
	public void run() {
		
		String name = "Peter";
		
		class Test {
			public void print() {
				System.out.println(name);
				System.out.println(count);
			}
		}
		
		new Test().print();
		
	}

}
