package lesson150519.concurrency;

import java.util.Random;
import utils.Utils;

public class RaceConditionWhileReading {
	
	static class Data {
		
		int a;
		int b;
		
		public Data(final int value) {
			setValue(value);
		}
		
		public void setValue(final int value){
			int calcResult = calc(value);
			synchronized (this) {
				a = value;
				Utils.pause(1000);
				b = a + calcResult;
			}
		}
		
		public boolean isGood() {
			synchronized (this) {
				return b == a + calc(a);				
			}
		}
		
		private int calc(final int value) {
			for (int i = 0; i < 1000000; i++) {
				Math.sqrt(value);
			}
			return value;
		}
	}
	
	public static void main(final String[] args) {
	
		final Data data = new Data(100);
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Random random = new Random();
				while(true) {
					Utils.pause(1000);
					int nextInt = random.nextInt(100);
					data.setValue(nextInt);
					System.out.println(nextInt);
				}
			}
		}).start();	
		
		while(true) {
			Utils.pause(1000);
			if(!data.isGood()) {
				System.out.println("Data is corrupted!");
			}
		}
	}
}
