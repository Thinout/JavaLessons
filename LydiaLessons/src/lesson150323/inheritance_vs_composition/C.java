package lesson150323.inheritance_vs_composition;

public class C extends A { // наследование
	// Создает жесткую зависимость от того, как реализован родитель
	public void use() {
		super.change();
	}
	
}
