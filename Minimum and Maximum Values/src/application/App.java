package application;

public class App {

	public static void main(String[] args) {
		System.out.printf("byte is %d bytes; min: %d, max %d\n", Byte.SIZE/8, Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.printf("short is %d bytes; min: %d, max %d\n", Short.SIZE/8, Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf("integer is %d bytes; min: %d, max %d\n", Integer.SIZE/8, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf("long is %d bytes; min: %d, max %d\n", Long.SIZE/8, Long.MIN_VALUE, Long.MAX_VALUE);
	}

}
