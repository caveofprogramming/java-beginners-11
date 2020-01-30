package application;

public class App {

	public static void main(String[] args) {

		Database db;

		try {
			db = new Database("db");
			db.getData();
			db.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
