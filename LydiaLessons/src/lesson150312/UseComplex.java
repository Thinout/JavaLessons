package lesson150312;

public class UseComplex {
	public static void main(String[] args) {
		Complex complex = new Complex(100);
		System.out.println("a = "+ complex.returnA() + ", b = " + complex.returnB());
		complex.change(50);
		complex.reportState();	
		//complex.a = 30000;
	}
}
