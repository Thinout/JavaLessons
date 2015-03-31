package lesson150331.linkedList.anonymous;

public abstract class D {
	
	public static D createUpper(final String initialState) {
		return new D(initialState) {

			@Override
			public void doSomething() {
				System.out.println(state.toUpperCase());
			}
		};
	}
	
	public static D createLower(final String initialState) {
		return new D(initialState) {

			@Override
			public void doSomething() {
				System.out.println(state.toLowerCase());
			}
			
		};
	}
	
	public static D createNatural(final String initialState) {
		return new D(initialState) {

			@Override
			public void doSomething() {
				System.out.println(state);
			}
			
		};
	}
	
	public D(final String initialState) {
		state = initialState;
	}
	
	String state = "Hello!";
	public abstract void doSomething();
	
	
	
}
