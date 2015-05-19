package lesson150519.concurrency;

import utils.Utils;

public class DaemonExample {
	
	public static void main(final String[] args) {
	
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					Utils.pause(1000);
					System.out.println("My name is " + Thread.currentThread().getName());
				}
			}
		});
		thread.start();
		
		System.out.println("My surname is " + thread.getThreadGroup());
		System.out.println("My surname is " + thread.currentThread().getThreadGroup());
		
	}
	
}
