package application;

/*
 * Create a multiplication table, like this:
 * 
 * 1 2 3 4 ..... 12
 * 2 4 6 8 ......24
 * ....
 * ...
 * 
 * 12 24 36 .....144
 * 
 */

public class App {

	public static void main(String[] args) {
		int[][] table = new int[12][12];
		
		for(int i=0; i < table.length; i++) {
			
			int[] row = table[i];
			
			for(int j=0; j < row.length; j++) {
				row[j] = (i+1) * (j+1);
			}
		}
		
		for(int[] row: table) {
			for(int value: row) {
				System.out.printf("%4d", value);
			}
			
			System.out.println();
		}
		
	}

}
