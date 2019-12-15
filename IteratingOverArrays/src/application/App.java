package application;

public class App {

	public static void main(String[] args) {

		String[] animals = {"cat", "dog", "sloth", "elephant"};
		
		for(int i=0; i<animals.length; i++) {
			System.out.printf("%d. %s\n", i, animals[i]);
		}
	}

}
