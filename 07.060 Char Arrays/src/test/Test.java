package test;

public class Test {

	public static void main(String[] args) {
		
		char c1 = 'A';
		char c2 = 'B';
		
		System.out.println(c1);
		
		System.out.println(c1 == c2);
		
		char c3 = '\u0000';
		System.out.println("'" + c3 + "'");
		
		char c4 = '\u00A9';
		System.out.println("'" + c4 + "'");
		
		char c5 = 65;
		System.out.println(c5);
		
		String text = "orange";
		char c6 = text.charAt(4);
		
		System.out.println(c6);
		
	}

}
