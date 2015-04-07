package lesson150407.generics;

public class UseStack {
	
	public static void main(final String[] args) {
		Stack<Integer> stack  = new Stack<>();
		for (int i = 0; i < 1000; i++) {
			stack.push(i);
		}
		int sum = 0;
		while(!stack.isEmpty()) {
			sum += stack.pop();			
		}
		System.out.println("sum is " + sum);
	}
	
	
}
