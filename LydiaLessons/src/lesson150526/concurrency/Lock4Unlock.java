package lesson150526.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lock4Unlock {
	
	public static void main(final String[] args) {
		
		Lock lock = new ReentrantLock();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				lock.lock();
				try {
					while(true) {
						
					}
				} finally {
					lock.unlock();
				}
			}
		}).start();
		
		Thread hatiko = new Thread(new Runnable() {		
			@Override
			public void run() {
			try {
				lock.lockInterruptibly();
			} catch (InterruptedException e) {
				System.out.println("Master!");
				return;
			}
			try {
				System.out.println("WOW");
			} finally {
				lock.unlock();
			}
			}
		}, "Hatiko");
		
		hatiko.start();
		
		hatiko.interrupt();
		System.out.println(hatiko.isAlive());
	}
	
}
