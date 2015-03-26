package lesson150326.interfaces;

public class KitchenTable extends Table {
	
	@Override
	public void move() {
		System.out.println("moving table");
	}

	@Override
	public void clean() {
		System.out.println("cleaning table");
	}

	@Override
	public void repair() {
		System.out.println("repairing kitchen table");
	}

	@Override
	public void paint() {
		System.out.println("painting kitchen table");
	}
	
}
