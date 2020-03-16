package app;

public class App {

	public static void main(String[] args) throws InterruptedException {

		Runnable runnable = () -> {
			for(int i = 0; i < 100; i++) {
				System.out.println("Value of i: " + i);
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		
		
		t1.start();
		t2.start();
		
		System.out.println("Hello");
		
		t1.join();
		t2.join();
	}

}
