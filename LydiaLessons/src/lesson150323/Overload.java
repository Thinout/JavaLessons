package lesson150323;

public class Overload {
	// В одном классе собраны несколько методов с одним и тем же именем
	public String search() {
		return null;
	}
	
	public String search(final int x) {
		return null;
	}
	
	public String search(final int x, final int y) {
		return null;
	}
	
	public String search(final String string) {
		return null;
	}
	
	public int search(final int x, final String string) {
		return 0;
	}
	
}
