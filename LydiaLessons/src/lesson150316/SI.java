package lesson150316;

public class SI {
	
	static int x;
	
	static { // инициализатор экземпляра был, 
		// + static -- работает только тогда, когда в первый раз обращаются к классу
		x = 10;
		System.out.println("Static init: " + x);
	}
	
	public SI() {
	
	}
	
	static void test() {
		System.out.println("This is test");		
	}
	
}
