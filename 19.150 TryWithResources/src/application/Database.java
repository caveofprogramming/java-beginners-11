package application;

public class Database implements AutoCloseable {

	private String connectionString;
	
	public Database(String connectionString) throws Exception  {
		
		System.out.println("Opening connection to " + connectionString);
		
		if(connectionString == null) {
			throw new Exception("Cannot connect to db " + connectionString);
		}
		
		this.connectionString = connectionString;
		
		System.out.println("Connect to " + connectionString);
	}
	
	public void getData() throws Exception {
		System.out.println("Getting data from " + connectionString);
		
		if(connectionString.length() < 3) {
			throw new Exception("Cannot get data from db " + connectionString);
		}
	}

	@Override
	public void close() throws Exception {
		
		System.out.println("Closing db connection ...");
		
		if(connectionString.length() > 5) {
			throw new Exception("Cannot close db " + connectionString);
		}
		
		System.out.println("Connection closed");
		
	}
	

}
