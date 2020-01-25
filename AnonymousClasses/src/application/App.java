package application;

public class App {
	
	private String name = "Jojo";

	public static void main(String[] args) {
		new App().start();
	}
	
	public void start() {
		Runnable runner = new Runnable() {
			public void run() {
				System.out.println(App.this.name);
			}
		};
		
		activate(runner);
		
		activate(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		});
	}
	
	public void activate(Runnable runnable) {
		runnable.run();
	}
}
