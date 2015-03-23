package lesson150323.inheritance;

import java.util.ArrayDeque;

public class MyStack extends ArrayDeque {
	
	@Override
	public void addFirst(final Object e) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public Object removeFirst() {
		throw new UnsupportedOperationException();
	}
	
}
