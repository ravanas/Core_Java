package org.robo.java;

public class Question_2_Join_Sleep {

	// @ thread.join() ----> to join two threads
	// @ thread.sleep() ----> wait for some milliseconds

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				long result = 0;
				for (int i = 0; i < 100000; i++) {
					result += i;
					System.out.println("Result " + result);
				}
			}
		});

		for (int i = 0; i < 100; i++) {
			if (i == 25)
				thread.start();
			try {
				// MainThread waits for the current thread to join
				// We didn't know how long we have to wait for the sub thread to
				// completes its task
				// In order to avoid this we use JOIN instead of
				// thread.sleep(1000)
				// ms -> millisecond
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hello " + i);
		}
	}
}
