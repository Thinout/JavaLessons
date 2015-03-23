package lesson150323.static_hiding;

public class Use {
	// Никогда не вызываем статический метод от переменной
	public static void main(final String[] args) {
		A a = new A();
		a.getCount();
		
		A a2 = new B();
		a2.getCount(); // Вызывается метод, относящийся к классу переменной
		
		B b = new B();
		b.getCount();
		
		
	}
}
