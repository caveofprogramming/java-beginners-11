package application;

public class Thermostat {
	
	// Temperature is in celsius
	public void setTemperature(double temperature) {
		
		setMachineTemperature(temperature);
		
		System.out.println("Setting temperature to " + temperature);
	}
	
	private void setMachineTemperature(double temperature) {
		if(temperature < 0 || temperature > 35) {
			throw new RuntimeException("Temperature out of range");
		}
	}
}
