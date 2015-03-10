package Lesson150310;

public class B {
	
	// state 
	A a = new A();
	
	public void change()
	{
		a.inc();
	}
	
	public void printState() {
		// метод с "побочным эффектом", крайне нежелательно для функционального подхода
		System.out.println("B's state is " + a.get());
	}
	
	public static void main(String[] args) { // еще одна точка входа
		B b = new B();
		b.change();
		b.printState();
	}
}
