package application;

public class Cat {
	private String name;
	public static final String FOOD = "Cat food"; 

	public Cat(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
	
	
}
