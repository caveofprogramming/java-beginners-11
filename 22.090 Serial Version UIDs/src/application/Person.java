package application;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 2L;
	
	private String name;
	private int id;
	
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	
	
}
