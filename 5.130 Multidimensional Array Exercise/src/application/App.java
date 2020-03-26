package application;



public class App {

	public static void main(String[] args) {
		
		String[][] words = new String[][] {
			{"one", "two", "three"},
			{"apple", "orange", "banana"},
			{"fox", "cat", "horse"}
		};
		
		System.out.println(words[1][1]);
		System.out.println(words[2][1]);
		
		words[2][1] = "otter";
		words[0][0] = "one!!!";
		words[2][2] = "rhino";
		
		for(String[] subArray: words) {
			
			for(String word: subArray) {
				System.out.printf("%s\t", word);
			}
			
			System.out.println();
		}
	}

}

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
