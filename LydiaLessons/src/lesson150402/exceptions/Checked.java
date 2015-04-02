package lesson150402.exceptions;

public class Checked {
	
	public static void main(final String[] args) {
		try {
			throw new Throwable();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		throw new RuntimeException();
	}
	
}
