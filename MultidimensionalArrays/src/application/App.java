package application;

public class App {

	public static void main(String[] args) {
		
		// Multidimensional arrays
		
		String[][] texts = {
				{"one", "two", "three"},
				{"four", "five"},
				{"seven", "eight", "nine"},
		};
		
		for(int i=0; i < texts.length; i++) {
			String[] subArray = texts[i];
			
			for(int j=0; j < subArray.length; j++) {
				System.out.printf("%s\t", subArray[j]);
			}
			
			System.out.println();
		}

	}

}
