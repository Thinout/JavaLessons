package lesson150312;

public class Init {
	                                                                                                
	int i = 10;
	
	{
		System.out.println("initializer start " + i);
		i = 30;
		System.out.println("initializer ends " + i);
		
	}
		
	public Init() {
		System.out.println("construktor starts " + i);
		i = 20;
		System.out.println("construktor ends " + i);		
	}
	
	public static void main(String[] args) {
		Init init = new Init();
		System.out.println(init.i);
	}
	
	{
		System.out.println("another init");
		i = 50;
	}
	
}
