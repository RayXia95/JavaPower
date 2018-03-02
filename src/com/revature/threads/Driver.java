package com.revature.threads;

public class Driver {

	public static void main(String[] args) throws Exception {
		Thread peter = new MyThread();
		peter.setName("Peter");
		peter.start();

		// Make the main method wait
		// peter.join();

		// until this line of execution
		Thread bobbert = new MyThread();
		bobbert.setName("Bobbert");
		bobbert.start();

		Runnable runnable = new MyRunnable();
		new Thread(runnable).start();

		/**
		 * Thurd way to implement a thread
		 */
		new Thread(() -> {
			for (int i = 10; i < 20; i++) {
				System.out.println("Third way " + i);
			}
		}).start();
	}

}
