package lesson150326.interfaces;

public class SurgeryTable extends Table {

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
		System.out.println("repairing surgery table");
	}

	@Override
	public void paint() {
		System.out.println("painting surgery table");
	}

}
