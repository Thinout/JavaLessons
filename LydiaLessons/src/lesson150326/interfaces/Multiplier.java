package lesson150326.interfaces;

public class Multiplier implements Changeable, Cleanable{
	
	int state;
	
	public void change() {
		state *= 2;
	}
	
	public void clean() {
		System.out.println("cleaning multiplier");
		state = 0;
	}
	
}
