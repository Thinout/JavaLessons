package lesson150326.interfaces;

public class Usage {
	
	public static void main(final String[] args) {
		
		C c = new C();
		c.use();
		
		B b = new B();
		b.setWorker(new A());
		b.use();
		b.setWorker(new Multiplier());
		b.use();
		
	}
	
}
