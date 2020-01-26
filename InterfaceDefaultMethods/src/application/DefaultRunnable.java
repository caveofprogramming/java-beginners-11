package application;

public interface DefaultRunnable extends Runnable {
	default void displayDetails() {
		System.out.println("No details to display");
	}
}
