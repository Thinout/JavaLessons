package lesson150406.exceptions;

import java.util.Scanner;

public class AutoClosableExample {
	
	static class MyResource implements AutoCloseable {
		
		{
			System.out.println("created MR");
		}
		
		public void process () {
			System.out.println("processing");
		}
		
		@Override
		public void close() {
			System.out.println("closed MR");
		}
		
	}
	
	public static void main(final String[] args) {
		
		
		try (Scanner scanner = new Scanner(System.in)){
			String line = scanner.nextLine();
			System.out.println(line);
		}
		try (MyResource res = new MyResource()){
			res.process();
		}
	}
	
	
}
