package lesson150310;

public class Garbage {
		
	protected void finalize() throws Throwable {
		System.out.println("I am dying...");
	} // вызывается, когда объект поддвергается сборке мусора
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Start!");
		Garbage[] g = new Garbage[1000]; // создание массива, в ячейках которого могут быть экз. класса мусор
		for (int i = 0; i < g.length; i++) {
			g[i] = new Garbage(); // уже заполнение массива
		}
		
		//System.gc(); // просьба к виртуальной машине выполнить сборку мусора, она может быть выполнена не сразу и не выполнена вообще
		
		//Thread.sleep(10000);
	}
	
}
