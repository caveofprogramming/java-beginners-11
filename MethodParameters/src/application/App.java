package application;

public class App {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		int squared = calc.square(9);
		
		System.out.println(squared);
	}

}
