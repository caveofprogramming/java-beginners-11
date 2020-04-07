package app;

public class App {

	public static void main(String[] args) {
		
		int value = 0b101011;
		
		System.out.println(toBinary(value));
	}
	
	public static String toBinary(int value) {
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
	}
	

}
