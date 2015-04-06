package lesson150406;

public class MultipleExceptions {
	
	public static class Exception3 extends Exception2 {

	}

	public static class Exception2 extends Exception1 {

	}

	public static class Exception1 extends Exception {

	}

	public static void main(final String[] args) {
		System.out.println("start");
		try {
			a();
			System.out.println("after a");
		} catch (Exception1 e) {
			e.printStackTrace();
		}
//		try {
//			a();
//			System.out.println("after a");
//		} catch (Exception1 | Exception2 | Exception3 e) {
//			e.printStackTrace();
//		}
		System.out.println("finish");
	}

	private static void a() throws Exception1, Exception2, Exception3 {
		b();
		throw new Exception3();
	}

	private static void b() throws Exception1, Exception2 {
		c();
		throw new Exception2();
	}

	private static void c() throws Exception1 {
		throw new Exception1();
	}
	
}
