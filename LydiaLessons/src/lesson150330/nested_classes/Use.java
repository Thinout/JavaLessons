package lesson150330.nested_classes;

public class Use {
	
	public static void main(final String[] args) {
		B b = new B();
		
		// static
		D d = new D();
		d.s.print();
		B.C c = new B.C();
		// inner
		E e = new E();
		e.i.print();
		E.I i = e.new I(); // можем создать только с использованием экземпляра класса
	}
	
}
