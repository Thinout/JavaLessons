package lesson150323.inheritance_vs_composition;

public class D { // хорошая композиция
	// более гибко подходит
	A a;
	
	public D(final A a) {
		this.a = a;
	}
	
	public void setA(final A a) {
		this.a = a;
	}
	
	public void use() {
		a.change();
		System.out.println(a.getState());
	}
	
}
