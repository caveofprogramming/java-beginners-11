package application;

public class App {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		float floatValue = 23.70f;
		double doubleValue = 23343.78;
		
		System.out.println("Float contains " + Float.SIZE/8 + " bytes.");
		System.out.println("Double contains " + Double.SIZE/8 + " bytes.");
		
		float f = 1.234567891234567f;
		System.out.printf("%.20f\n", f);
		
		double d = 1.234567891234567;
		System.out.printf("%.20f\n", d);
	}

}
