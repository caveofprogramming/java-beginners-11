package app;

public class App {

	public static void main(String[] args) {
	
		// !0 = 1
		// !1 = 1
		// !2 = 2 x 1
		// !3 = 3 x 2 x 1
		// !4 = 4 x 3 x 2 x 1

		System.out.println(factorial(4));
	}

	
	private static int factorial(int value) {
		
		if(value == 0) {
			return 1;
		}
		
		return value * factorial(value - 1);
	}

}
