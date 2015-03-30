package lesson150330.nested_classes;

public class E {
	
	class I { // inner
		// на самом деле хранится ссылка на экземпляр класса Е
		void print() {
			System.out.println(state);
		}
	}
	
	int state;
	I i;
	
	public E() {
		i = new I(); // сюда неявно передается ссылка на текущий объект класса Е
	}
}
