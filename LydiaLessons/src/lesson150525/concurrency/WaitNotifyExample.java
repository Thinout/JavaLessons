package lesson150525.concurrency;

import utils.Utils;

public class WaitNotifyExample {
	
	static class Sprinter implements Runnable {

		@Override
		public void run() {
			
			System.out.println("Created " + this);
			
			synchronized (this) {
				try {
					System.out.println("Before wait");
					wait(); // this.wait()
					System.out.println("Afrer wait");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("Started " + this);
		}
		
		public static void main(final String[] args) {
			
			Sprinter sprinter = new Sprinter();
			
			new Thread(sprinter).start();
			
			Utils.pause(3000);
			synchronized (sprinter) {
				sprinter.notifyAll();				
				Utils.pause(15000);
			} 
			Utils.pause(15000);
			
		}
		
	}
	
}
