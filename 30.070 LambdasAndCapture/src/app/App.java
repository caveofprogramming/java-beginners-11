package app;

public class App {
	
	//private int value = 0;

	public static void main(String[] args) {
		new App().runApp();
	}
	
	
	public void runApp() {
		
		int value = 0;
		
		
		Runnable r = () -> {
			System.out.println(this);
			//System.out.println(value++);
			System.out.println(value);
		};
		
		r.run();
		r.run();
	}


}
