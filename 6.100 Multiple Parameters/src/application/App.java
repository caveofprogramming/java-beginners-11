package application;

public class App {

	public static void main(String[] args) {
		
		final int toSquare = 11;
		
		Calculator calc = new Calculator();
				
		int squared = calc.square(toSquare);
		System.out.printf("%d squared is : %d\n", toSquare, squared);
		
		int added = calc.add(7, 5);
		System.out.println("7 plus 5 is: " + added);
		

		int multiplied = calc.multiply(7, 5);
		System.out.println("7 times 5 is: " + multiplied);
	}

}
