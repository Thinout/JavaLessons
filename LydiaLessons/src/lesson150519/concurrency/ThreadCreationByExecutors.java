package lesson150519.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import utils.Utils;

public class ThreadCreationByExecutors {
	
	static class Task implements Runnable {

		@Override
		public void run() {
			Utils.pause(1000);
			System.out.println(Thread.currentThread().getName() + " <3");
		}
		
	}
	
	public static void main(final String[] args) {
		
		ExecutorService ex = Executors.newFixedThreadPool(2);
		
		ex.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("You know nothing, John Snow");
			}
		});
		
		Task task = new Task();
		ex.execute(task);
		ex.execute(task);
		ex.execute(task);
		ex.execute(task);
		
		ex.shutdown();
		
		System.out.println(Thread.currentThread().getName());
	}
	
}
