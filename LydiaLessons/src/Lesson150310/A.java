package Lesson150310;

public class A {
	public static void main(String[] args) {
		
	}
	// class members
	public A() {
	}
	public A(int initialState) {
		i = initialState;
	}
	// состояния (fields)
	int i;
	// поведение (methods)
	public void inc() {
		i++;
	}
	public int get()
	{
		return i;
	}
}
