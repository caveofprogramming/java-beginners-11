package app;

class Person implements Comparable<Person> {
	private String name;
	
	public Person() {
		this.name = "[no name]";
	}

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

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
	}
}

interface PersonCreator {
	Person create();
}

interface PersonNameCreator {
	Person create(String name);
}

public class App {

	public static void main(String[] args) {

		PersonCreator c1 = () -> new Person();
		Person p1 = c1.create();
		System.out.println(p1);
		
		PersonNameCreator c2 = name -> new Person(name);
		Person p2 = c2.create("Estella");
		System.out.println(p2);
		
		PersonCreator c3 = Person::new;
		Person p3 = c3.create();
		System.out.println(p3);
		
		PersonNameCreator c4 = Person::new;
		Person p4 = c4.create("Estella");
		System.out.println(p4);
		
	}

}
