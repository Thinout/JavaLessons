package lesson150518.concurrency;

public class RaceCondition {
	
	static class Counter {
		int count;
		
		synchronized int inc() {
			//System.out.println(count);
			return ++count;
		}
	}	
	
	public static void main(final String[] args) {
		
		final Counter cnt = new Counter();
		
		Runnable task = new Runnable() {		
			@Override
			public void run() {
				while(true) {
					int r = cnt.inc();
					System.out.println(r);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		
		t1.start();
		t2.start();
		
	}
	
}
