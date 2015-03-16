package lesson150316;

public class DatabaseConnection {
	// ограничить количество экземпляров класса, созданных в системе
	private static final int MAX_CONNECTIONS = 3; // single turn
	private static int Counter;
	
	// фабричный метод
	public static DatabaseConnection create() {
		if(Counter >= MAX_CONNECTIONS) {
			return null;
		}
		return new DatabaseConnection();
	}
	
	static public void freeAny() { // класс решает, каким образом высвободить ресурсы
		Counter--;
	}
	
	public void free() { // высвобождение ресурсов привязано к конкретному объекту
		Counter--;
	}
	
	{
		Counter++;
	}	
	
	private DatabaseConnection() {
		
	}
	
}
