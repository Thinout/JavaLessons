package lesson150323.inheritance_vs_composition;

public class FComposition {
	// Ведет себя как F, но принцип подстановки нарушается
	F f;
	public FComposition(final F f) {
		this.f = f;
	}
	
	public void methodA() {
		f.m1();
		// something else
	}
	public void methodB() {
		f.m2();
	}
	public void methodD() {
		f.m3();
	}
	public void methodC() {
		f.m4();
	}

	
	
}
