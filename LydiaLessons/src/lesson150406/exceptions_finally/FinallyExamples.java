package lesson150406.exceptions_finally;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FinallyExamples {
	
	public static void main(final String[] args) {
		Lock lock = new ReentrantLock(); // mutex
		
		lock.lock(); // захватили ресурс
		try { // критическая секция, блок, который выполняет только один поток в одну единицу времени
			doSomething();
		} finally { // что бы ни произошло, в любом случае сделать
			lock.unlock();
			System.out.println("unlocked");
		}
		System.out.println("finish");
	}

	private static void doSomething() {
		throw new RuntimeException();
	}
	
	
}
