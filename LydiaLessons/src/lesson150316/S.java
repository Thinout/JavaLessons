package lesson150316;

public class S {
	
	public static int Counter; // class member
	
	{
		Counter++; // код, исполняемый в любом случае 
	}
	
	public int counter = 10; // instance member
	public S() {
		// Counter++; bad style, это инициализатор состояния
	}
	
	public S(final int c){
		counter = c;
	}
	
}
