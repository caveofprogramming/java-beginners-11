package application;

import application.exceptions.TemperatureTooHighException;
import application.exceptions.TemperatureTooLowException;

public class Thermostat {
	
	// Temperature is in celsius
	public void setTemperature(double temperature) throws TemperatureTooLowException, TemperatureTooHighException  {
		
		setMachineTemperature(temperature);
		
		System.out.println("Setting temperature to " + temperature);
	}
	
	private void setMachineTemperature(double temperature) throws TemperatureTooLowException, TemperatureTooHighException  {
		if(temperature < 0) {
			throw new TemperatureTooLowException("Temperate below minimum threshold");
		}
		else if(temperature > 35) {
			throw new TemperatureTooHighException("Temperature above maximum threshold");
		}
	}
}
