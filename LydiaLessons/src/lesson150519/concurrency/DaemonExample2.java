package lesson150519.concurrency;

import utils.Utils;

public class DaemonExample2 {
	
	public static void main(final String[] args) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Utils.pause(15000);
			}
		}, "Божество").start();
		
		startDaemon("Хоттабыч");
		startDaemon("Бальтазар");
		startDaemon("Петрович");
		
	}
	
	public static void startDaemon(final String name) {
		class Task implements Runnable {
			@Override
			public void run() {
				while(true) {
					Utils.pause(1000);
					System.out.println(Thread.currentThread().getName());
				}
			}	
		}
		
		Thread thread = new Thread(new Task(), name);
		thread.setDaemon(true);
		thread.start();
		
	}

}
