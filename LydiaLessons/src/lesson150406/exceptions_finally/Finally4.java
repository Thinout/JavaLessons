package lesson150406.exceptions_finally;

public class Finally4 {
	
	public static void main(final String[] args) {
		
		System.out.println(calc());
		
	}

	private static int calc() {
		try {
			return 20;			
		} finally {
			return 10;
		}
	}
	
	
}
