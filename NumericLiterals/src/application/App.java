package application;

public class App {

	public static void main(String[] args) {
		
		long lValue = 13348373898L;
		System.out.println(lValue);
		
		float fValue = 7.34F;
		System.out.println(fValue);
		
		byte bValue = (byte)128;
		System.out.println(bValue & 0xFF);
		
		int iValue = 1_000_000;
		System.out.println(iValue);
		
		double dValue = 1.5E6;
		System.out.println(dValue);

	}

}
