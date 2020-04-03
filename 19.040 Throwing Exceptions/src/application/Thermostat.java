package application;

public class Thermostat {
	
	// Temperature is in celsius
	public void setTemperature(double temperature) throws Exception {
		
		if(temperature < 0 || temperature > 35) {
			throw new Exception("Temperature out of range");
		}
		
		System.out.println("Setting temperature to " + temperature);
	}
}
