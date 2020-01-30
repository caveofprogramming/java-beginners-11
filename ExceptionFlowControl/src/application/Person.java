package application;

public class Person {

	void setName(String name) throws Exception {
		if(name == null) {
			throw new Exception("Name cannot be null");
		}
		
		System.out.println("Name is set to " + name);
	}
}
