package lesson150525.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import utils.Utils;

public class Stopper {
	
	static class Task implements Runnable {

		volatile boolean stop = false;
		
		@Override
		public void run() {
			long count = 0;
			while(!stop) {
				count++;
			}
			System.out.println("Stopped at " + count);
		}
		
		public void stop() {
			stop = true;
		}
		
	}
	
	public static void main(final String[] args) {		
		System.out.println("Start");
		
		Task task = new Task();
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.execute(task);		
		Utils.pause(3000);
		task.stop();
		
		System.out.println("Finish");
		
	}
	
}
