package application;

public class App {

	public static void main(String[] args) {


		try(Database db = new Database("ab43")) {
			db.getData();
		} catch (Exception e) {
			System.out.println("Catching exception ...");
			System.out.println(e.getMessage());
		}

	}

}
