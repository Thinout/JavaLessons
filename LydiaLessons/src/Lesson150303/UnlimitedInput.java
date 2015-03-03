package Lesson150303;
import java.util.Scanner;

public class UnlimitedInput {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			while(scanner.nextLine().equals("stop")) {
				System.out.println(scanner.nextLine());
			}
			System.out.println("Good");
		}
}
