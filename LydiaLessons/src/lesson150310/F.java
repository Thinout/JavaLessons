package lesson150310;

public class F {
	
	int i = 10;
	private int j;
	private int k;
	
	public F() {
		this(20, 0);
		k = 10;
		
	}
	
	public F(int i) {
		
		this.i += i;
	}
	
	public F(int i, int j) {
		
	}
	public F(int i, int j, int k) {
		this.i = i;
		this.j = j;
		this.k = k;
	}
	
}
