package application;

import application.exceptions.TemperatureTooHighException;
import application.exceptions.TemperatureTooLowException;

public class App {

	public static void main(String[] args) {
		Thermostat stat = new Thermostat();

		try {
			stat.setTemperature(80);
		} catch (TemperatureTooLowException | TemperatureTooHighException e) {
			System.out.println(e.getMessage());
		}

		try {
			stat.setTemperature(80);
		} catch (TemperatureTooLowException e) {
			System.out.println(e.getMessage());
		} catch (TemperatureTooHighException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
