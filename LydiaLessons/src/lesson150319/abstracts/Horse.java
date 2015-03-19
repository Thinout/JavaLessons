package lesson150319.abstracts;

public class Horse extends Vehicle{
	@Override
	public void moveTo(final int x, final int y) {
		for(int i = 0; i<x; i++) {
		System.out.println("тыгыдым-тыгыдым");
		}
		System.out.println("и прискакал!");
	}
}
