package lesson150312;

public class Complex {
	
	private int a, b;
	
	public Complex(int initialValue) {
		a = 0;
		b = initialValue;
	}
	void someMethod() {
		
	}
	
	protected int returnA() {
		return a;
	}
	
	public int returnB() {
		return b;
	}
	
	public void reportState() {
		System.out.println("a = "+ a + ", b = " + b);
	}
	
	public void change(int delta) {
		incA(delta);
		incB(delta);
	}

	private void incA(int delta) {
		a += delta;
	}
	
	private void incB(int delta) {
		b -= delta;
	}
	
}
