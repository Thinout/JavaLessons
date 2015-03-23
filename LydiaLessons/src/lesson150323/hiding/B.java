package lesson150323.hiding;

public class B extends A{
	
	int state; // Прячет родительский state --> этой ситуации нужно избегать
	// По-разному называем переменные
	// Настроить eclipse/Errors/hide --> Error
	
	@Override
	public void change() {
		state += 2;
	}
	
	// Overload
	
	
	
	public static void main(final String[] args) {
		B b = new B();
		
		System.out.println(b.state);

		b.change();
		// Getter не спасет
		System.out.println(b.getState());
	}
	
}
