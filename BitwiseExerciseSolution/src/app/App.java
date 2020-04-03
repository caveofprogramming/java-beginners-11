package app;

public class App {

	public static void main(String[] args) {
		int color = 0x00123456;
		
		int blue = color & 0xFF;
		int green = (color >> 8) & 0xFF;
		int red = (color >> 16) & 0xFF;
		
		System.out.printf("%08x\n", blue);
		System.out.printf("%08x\n", green);
		System.out.printf("%08x\n", red);
		
		int combined = (red << 16) | (green << 8) | blue;
		
		System.out.printf("%08x\n", combined);
	}

}
