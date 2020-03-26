package application;

public class Database implements AutoCloseable {

	private String connectionString;
	
	public Database(String connectionString) {
		
		System.out.println("Opening connection to " + connectionString);
		
		this.connectionString = connectionString;
	}
	
	public void getData() {
		System.out.println("Getting data from " + connectionString);
	}

	@Override
	public void close() {
		System.out.println("Closing db connection ...");
		
	}
	

}
