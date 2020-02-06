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
		Integer value = 8;

		if (value > 7) {
			value = null;
		}

		if (value == null) {
			System.out.println("Value not set");
		} else {
			System.out.println(value);
		}

		// parse methods
		String floatText = "dfdsaf73.34";

		try {
			float floatValue = Float.parseFloat(floatText);
			System.out.println(floatValue);
		} catch (NumberFormatException e) {
			System.out.println("Invalid text for conversion");
		}

		// Integer toString
		String intString = Integer.toString(32, 2);
		System.out.println(intString);

		// toBinaryString
		System.out.println(Integer.toBinaryString(8));
	}

}
