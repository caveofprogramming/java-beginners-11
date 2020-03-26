package application;

public class App {

	public static void main(String[] args) {

		Database db = null;

		try {
			db = new Database(null);
			db.getData();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				db.close();
			}
			catch(NullPointerException e) {
				System.out.println(e.getMessage());
				System.out.println("Null pointer exception.");
			}
			catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}

	}

}
