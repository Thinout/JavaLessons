package lesson150316;

public class B { // pass reference by value
	
	
	private int _state;

	public B(final int initialState) {
		_state = initialState;
	}
	
	public static void main(final String[] args) {
		
		final B b1 = new B(10);
		final B b2 = b1;
		process(b1); // происходит передача параметра по значению
		
		System.out.println(b1._state); // private не запрещает обращаться к экземплярам класса внутри этого класса
		
	}

	private static void process(final B b) { // можно поставить final, не давая изменить входной параметр
		// b = new B(30); ERROR
	}
}
