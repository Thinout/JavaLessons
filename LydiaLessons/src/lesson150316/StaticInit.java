package lesson150316;

public class StaticInit {
	
	public static void main(final String[] args) {
		SI si; // этого недостаточно, чтобы сработал иницииализатор
		System.out.println("Start");
		// Чтобы сработал статич. иниц.:
		// 1
		new SI();
		// 2
		System.out.println(SI.x);
		// 3
		SI.test();
		
		
	}
	
	
}
