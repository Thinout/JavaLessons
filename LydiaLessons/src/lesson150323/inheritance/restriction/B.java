package lesson150323.inheritance.restriction;


public class B extends A {
	protected void one() {
		super.one();
	}
	@Override
	protected void two() {
		super.two();
	}
	
	@Override
	public void three() {
		throw new UnsupportedOperationException("this operation is prohibited");
	}
}
