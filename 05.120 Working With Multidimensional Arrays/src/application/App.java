package application;

public class App {

	public static void main(String[] args) {

		// Multidimensional arrays
		
		var texts = new String[][] { 
				{ "one", "two", "three" }, 
				{ "four", "five" }, 
				{ "seven", "eight", "nine" }, 
		};

		for (int i = 0; i < texts.length; i++) {

			for (int j = 0; j < texts[i].length; j++) {
				System.out.printf("%s\t", texts[i][j]);
			}

			System.out.println();
		}

	}

}
