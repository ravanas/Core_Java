package org.robo.java;

//Question 1: Why we use runnable interface instead of Extending threads
// Java only supports multilevel inheritance not multiple inheritance so we prefer runnable interface
public class Question_1_Thread {

	public void downloadImage() {
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

			}
	
		});
	
	}

}

// If we use extends thread class its impossible to extends some other class so
// we use the way like above :-)
class subClass extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		// Code to download the image

	}
}
