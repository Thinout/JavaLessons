package lesson150428.reflection;

public class ClassExamples {

	public static void main(final String[] args) {
		
		A a = new A();
		// получить ссылку на объект класса A
		Class class1 = A.class;
		Class class2 = a.getClass();
				
		inspect(a);
		inspect("Hello");
				
		int i, n = 37;
		for (i = 0; i < n; i--) {
			System.out.println(n + "*");
		}
	}

	private static void inspect(final Object object) {
		Class clazz = object.getClass();
		
		System.out.println(clazz.getName());
		
		try {
			Object someObject = clazz.newInstance();
			System.out.println("New object's class is " + someObject.getClass());
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		for (Class cl : clazz.getInterfaces()) {
			System.out.println(cl);
		}
		
		for (Class cl : clazz.getClasses()) {
			System.out.println(cl);
		}
		
		System.out.println("--------");
		
		
	}
	
}
