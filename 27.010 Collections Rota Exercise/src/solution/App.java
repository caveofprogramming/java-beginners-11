package solution;

public class App {

	private String[][] peopleSkills = { { "Oliver", "programming", "electronics" },
			{ "Jake", "reception", "engineering" },
			{ "Amelia", "programming", "reception", "electronics", "management" },
			{ "Noah", "management", "electronics" }, 
			{ "James", "programming", "management", "electronics" },
			{ "Margaret", "engineering", "electronics", "programming", "reception" }, 
			{ "Emma", "programming" },
			{ "Jack", "engineering", "electronics", "programming" }, 
			{ "Mary", "engineering", "electronics" },
	};
	
	public static void main(String[] args) {
		new App().run();
	}
	
	public Rota populateRota() {		
		Rota rota = new Rota();
		
		for(var row: peopleSkills) {
			var name = row[0];
			
			Person person = new Person(name);
			
			for(int i = 1; i < row.length; i++) {
				var skill = row[i];
				
				person.addSkills(skill);
			}
			

			rota.addPerson(person);
		}
		
		return rota;
	}
	
	public void run() {
		Rota rota = populateRota();
		
		rota.nextWeek();
		System.out.println(rota);
		
		rota.nextWeek();
		System.out.println(rota);
		
	}

}
