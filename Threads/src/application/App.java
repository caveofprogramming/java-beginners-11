package application;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

class Alert extends TimerTask {

	@Override
	public void run() {
		JOptionPane.showMessageDialog(null, "Egg cooked!");
	}

}

class Status implements Runnable {

	@Override
	public void run() {
		System.out.println("Timer running.");
	}
	
}

public class App {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Alert(), 600000L, 600000L); // Ten minutes

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Status(), 0, 1L, TimeUnit.MINUTES);
	}
}
