package lesson150310;

public class UseF {
	public static void main(String[] args) {
		F f1 = new F(); // если нет ни одного коструктора, создается коструктор по умолчанию
		F f2 = new F(100);
		System.out.println(f2.i);
	}
}
