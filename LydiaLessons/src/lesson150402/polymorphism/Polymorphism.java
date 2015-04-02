package lesson150402.polymorphism;

public class Polymorphism {
	
	static class A {
		
		
	}
	
	static class B extends A {
	
		public String toString() {
			return "this is B";
		}
	}
	
	public static void main(final String[] args) {
		B b = new B();
		A a = b;
		Object o = a;
		printObjectsDetails(o);
	}

	private static void printObjectsDetails(final Object o) {
		System.out.println(o);
	}
	
}
