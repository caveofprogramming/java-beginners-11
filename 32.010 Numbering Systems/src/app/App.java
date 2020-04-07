package app;

public class App {

	public static void main(String[] args) {
		
		/*
		 * 0 - 9 decimal
		 * 0 - 1 binary
		 * 0 - F hexadecimal
		 * 
		 * 6213
		 * 
		 * 0, 1, 10, 11, 100, 101, 110, 111, 1000
		 * 
		 * 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F, 10, 11, 12...
		 * 
		 * 
		 * 
		 */
		
		int value = 123;
		
		System.out.println(Integer.toBinaryString(value));
		System.out.println(Integer.toHexString(123));
		
		int value255 = 0xFF;
		
		System.out.println(value255);
	}

}
