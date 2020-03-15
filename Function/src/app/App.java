package app;

import java.util.function.UnaryOperator;

public class App {

	public static void main(String[] args) {
		new App().run();
	}
	
	public void run() {
		calculateAndPrint(7, n -> n*n);
		calculateAndPrint(7, n -> n + 1);
		calculateAndPrint(7, n -> 0);
	}
	
	protected void calculateAndPrint(int value, UnaryOperator<Integer> procedure) {
		
		int result = procedure.apply(value);
		
		System.out.println(result);
	}

}
