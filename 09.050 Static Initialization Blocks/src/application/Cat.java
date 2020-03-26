package application;

public class Cat {
	private String name;
	public static final String FOOD = "Cat food"; 
	private static int count = 5;
	private int id;
	
	static double averageHeight;
	
	static {
		averageHeight = 215/7.0;
		System.out.println("Hello");
	}
	
	public Cat(String name) {
		this.name = name;
		
		id = count;
		
		count++;
	}
	
	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return String.format("Cat id: %d, name: %s", id, name);
	}
	
	
}
