package lesson150331.nested.local_var;

import java.security.Provider.Service;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class LocalVarExample {
	
	public static void main(final String[] args) {
		
//		if(args.length == 0) {
//			System.out.println("Usage: give name as a parameter");
//			System.exit(0);
//		}
		System.out.print("Enter your name");
		Scanner scanner = new Scanner(System.in);
		
		final String name = scanner.nextLine();
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor(); // сервис по запуску задач
		
		service.schedule(new Runnable() {
			// автоматически создается локальная переменная и при создании экземпляра анонимного класса переменная передается по значению
			// String name;
			@Override
			public void run() {
				System.out.println("Hello, " + name);
			}
		}, 3, TimeUnit.SECONDS);
	}
	
	
}
