package test;

public class Test {

	public static void main(String[] args) {

		int[] values = { 6, 3, 92, 63, 14 };

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int currentValue : values) {
			min = currentValue < min ? currentValue : min;
			max = currentValue > max ? currentValue: max;
		}

		System.out.println(min);
		System.out.println(max);

	}

}
