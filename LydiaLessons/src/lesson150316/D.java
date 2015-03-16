package lesson150316;

public class D {
	// 1 статические
	public static D create(final int x, final int y) { // фабричный метод
		if (x + y != 100) {
			return null;
		}
		return new D(x,y);
	}
	// 2 поля
	final int _x;
	final int _y;
	// 3 конструкторы
	private D (final int x, final int y) {
//		if (x + y != 100) {
//			System.err.println("bad data");
//			return;
//		}
		_x = x;
		_y = y;	
	}
	
	// 4 getters and setters
	public int getX() {
		return _x;
	}

	public int getY() {
		return _y;
	}
	// 5 методы, меняющие состояния
	
	
}
