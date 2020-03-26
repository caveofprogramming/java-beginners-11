
public class App {

	public static void main(String[] args) {
		
		int cats = 5;
		
		System.out.println(cats++);
		System.out.println(cats);
		
		int dogs = 3;
		System.out.println(++dogs);
		
		int giraffes = 10;
		
		int animals = cats + giraffes++;
		
		System.out.println(animals);
		
		int oranges = 4;
		int totalOranges = oranges;
		System.out.println(totalOranges);
		
		int apples = 5;
		int bananas = 4;
		
		int fruits = ++apples + bananas++;
		System.out.println(fruits);
	
	}

}
