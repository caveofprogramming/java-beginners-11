package application;

public class Person {

	private String name;
	private int age;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
