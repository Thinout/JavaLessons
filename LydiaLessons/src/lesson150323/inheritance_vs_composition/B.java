package lesson150323.inheritance_vs_composition;

public class B { // композиция 
	
	A a = new A();
	
	public void use() {
		a.change();
		System.out.println(a.getState());
	}
	
}
