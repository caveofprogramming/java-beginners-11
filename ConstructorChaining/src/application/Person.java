package application;

public class Person {
	private String name;
	private int age;
	
	private static final String NO_NAME = "[not supplied";
	
	public Person() {
		this(NO_NAME, 0);
	}
	
	public Person(String name) {
		this(name, 0);
	}
	
	public Person(int age) {
		this(NO_NAME, age);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
		System.out.println("Main constructor running!");
	}
	
	public String toString() {
		return name + ", " + age;
	}
}
