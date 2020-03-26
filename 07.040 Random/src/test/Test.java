package test;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		int[] values = {2, 4, 6, 8};
		
		Random random = new Random();
		
		for(int i=0; i<100; i++) {
			int randomValue = values[random.nextInt(values.length)];
			System.out.print(randomValue);
			System.out.print(" ");
		}

	}

}
