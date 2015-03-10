package Lesson150310;

public class F {
	
	int i = 10;
	
	public F() {
		i = 20;
	}
	
	public F(int i) {
		this();
		this.i += i;
	}
	

}
