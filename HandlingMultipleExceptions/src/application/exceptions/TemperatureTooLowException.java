package application.exceptions;

public class TemperatureTooLowException extends TemperatureOutOfRangeException {
	private static final long serialVersionUID = 1L;

	public TemperatureTooLowException(String message) {
		super(message);
	}

}
