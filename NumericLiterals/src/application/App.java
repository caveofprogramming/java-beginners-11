package application;

public class App {

	public static void main(String[] args) {
		
		long value1 = 123456789123L;
		float value2 = 32.7F;
		byte value3 = (byte)127;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		int value4 = 10_000_000;
		System.out.println(value4);
		
		double value5 = 1.5E7;
		System.out.printf("%.2f\n", value5);
	}

}
