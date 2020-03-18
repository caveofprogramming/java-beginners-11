package app;

class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}

interface NameGetter {
	String get(Person p);
}

interface NameSetter {
	void set(Person p, String name);
}

public class App {

	public static void main(String[] args) {
		
		Person person = new Person("Joe");
		
		NameGetter getter1 = p -> p.getName();
	
		System.out.println(getter1.get(person));
		
		NameGetter getter2 = Person::getName;
		
		NameSetter setter1 = Person::setName;
		setter1.set(person, "Elizabeth");
		
		System.out.println(getter2.get(person));
	}

}
