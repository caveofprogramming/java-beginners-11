package application;

/*
 * Exercise:
 * 
 * Create a multidimensional array of int.
 * Make it 3 x 3
 * Loop through it and output all the values on the diagonal,
 * from top left to bottom right.
 * Add up these values and print the total.
 *
 */

public class App {

	public static void main(String[] args) {
		
		int[][] values = {
				{1, 2, 3},
				{2, 4, 6},
				{4, 8, 12},
		};
		
		int total = 0;
		
		for(int i=0; i < 3; i++) {
			System.out.println(values[i][i]);
			
			total += values[i][i];
		}
		
		System.out.println("Total: " + total);

	}

}
