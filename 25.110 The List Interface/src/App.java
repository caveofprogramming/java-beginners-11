import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(5);
		numbers.add(7);
		numbers.add(8);
		
		displayList(numbers);


	}
	
	private static void displayList(List<Integer> list) {
		list.forEach(System.out::println);
	}

}
