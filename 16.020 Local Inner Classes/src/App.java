public class App {
	
	private String name;
	
	public App() {
		name = "Elizabeth";
	}

	public static void main(String[] args) {
		new App().run();
	}
	
	private void run() {
		
		class Printer {
			public void print() {
				System.out.println(App.this.name);
			}
		}
		
		new Printer().print();
	}

}
