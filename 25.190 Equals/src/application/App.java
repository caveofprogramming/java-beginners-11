package application;

class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object other) {
		
		if(other == null) {
			return false;
		}
		
		if(other == this) {
			return true;
		}
		
		if(!(other instanceof Person)) {
			return false;
		}
		
		if(this.name == null) {
			return false;
		}
		
		Person p = (Person)other;
		
		if(p.name == null) {
			return false;
		}
		
		return this.name.equals(p.name);
	}
}

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person("Joe");
		Person p2 = new Person("Joe");
		
		System.out.println(p1.equals(p2));
	}

}
