package app;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {
	
	
	public static void greet() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		var service = Executors.newScheduledThreadPool(1);
		
		service.scheduleAtFixedRate(App::greet, 0, 1000, TimeUnit.MILLISECONDS);
	}

}
