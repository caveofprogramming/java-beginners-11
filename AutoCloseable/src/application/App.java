package application;

public class App {

	public static void main(String[] args) {

		Database db = new Database("localhost:3306");
		
		db.getData();
		
		db.close();
	}

}
