package lesson150406;

public class LogWithStackTrace {
	
	public static void log(final String message) {
		Exception e = new Exception();
		System.out.println(e.getStackTrace()[1].getMethodName() + ": " + message);
	}
	
	public static void main(final String[] args) {
		log("message1");
		a();
		b();
	}

	private static void b() {
		log("there");
	}

	private static void a() {
		log("here");
	}
	
}
