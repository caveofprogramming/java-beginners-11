import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		
		HashSet<String> fruits = new HashSet<>();
		
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("orange");
		fruits.add("pear");
		
		System.out.println(fruits.contains("orange"));
		
		for(var fruit: fruits) {
			System.out.println(fruit);
		}

	}

}
