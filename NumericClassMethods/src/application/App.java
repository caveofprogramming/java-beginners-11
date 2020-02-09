package application;

public class App {

	public static void main(String[] args) {

		/*
		 * boolean Boolean char Character
		 * 
		 * byte Byte short Short int Integer long Long
		 * 
		 * float Float double Double
		 * 
		 */

		// equals
		Integer intValue1 = 128;
		Integer intValue2 = 128;

		System.out.println(intValue1.equals(intValue2));

		// setting null
		Double dValue = null;
		System.out.println(dValue);

		// parse methods
		
		String intString = "73";
		
		try {
			int intValue = Integer.parseInt(intString);
			System.out.println(intValue);
		} catch (NumberFormatException e) {
			System.out.println("Cannot convert to int: " + intString);
		}

		// Integer toBinaryString
		
		String binString = String.format("%8s", Integer.toBinaryString(23)).replace(' ', '0');
		System.out.println(binString);

	}

}
