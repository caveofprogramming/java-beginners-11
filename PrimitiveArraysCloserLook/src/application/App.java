package application;

public class App {

	public static void main(String[] args) {
		
		int value;
		value = 123;
		System.out.println(value);
		
		int[] values = null;
		System.out.println(values);
		
		values = new int[3];
		
		for(int n: values) {
			System.out.println(n);
		}
	}

}
