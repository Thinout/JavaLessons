package lesson150310;

public class E { // вспомогательный класс
	
	//private A a;
	public void use (A a) {
		a.inc();
		printState(a);
	}
	
	public void change(A a) {
		a.inc();
	}
	public void printState(A a) {
		System.out.println(a.get());
	}
	
	public static void main(String[] args) {
		A a = new A(3);
		E e = new E();
		e.use(a); // отсутствует состояние, присутствует только поведение
	}
}
