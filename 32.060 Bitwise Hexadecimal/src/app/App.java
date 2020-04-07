package app;

public class App {

	public static void main(String[] args) {
		
		int value = 0xFF;
		
		int result = value << 8;
		
		System.out.printf("%08x\n", value);
		System.out.printf("%08x\n", result);
		
		int color = 0x00123456;
		
		int green = (color & 0x00FF00) >> 8;
		
		System.out.printf("%08x\n", green);

	}

}
