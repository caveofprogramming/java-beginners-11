package application.exceptions;

public class TemperatureTooHighException extends TemperatureOutOfRangeException {

	private static final long serialVersionUID = 1L;
	
	public TemperatureTooHighException(String message) {
		super(message);
	}

}
