package application;

public class Machine implements DefaultRunnable {

	@Override
	public void run() {
		System.out.println("Machine running");
	}

	@Override
	public void displayDetails() {
		System.out.println("No details to display");
	}

}
