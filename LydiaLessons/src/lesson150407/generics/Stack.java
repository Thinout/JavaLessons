package lesson150407.generics;

public class Stack <T> {
	
	private static final int INITIAL_CAPACITY = 10;
	T[] items;
	int tos; // top of stack
	
	public Stack() {
		items = (T[]) new Object[INITIAL_CAPACITY];
		tos = -1; 
	}
	
	public void push(final T item) {
		if (tos == items.length - 1) {
			changeItemsCapacity(items.length * 2);
		}
		items[++tos] = item;
	}
	
	private void changeItemsCapacity(final int capacity) {
		System.out.println("change capacity to " + capacity);
		T[] newItems = (T[]) new Object[capacity];
		System.arraycopy(items, 0, newItems, 0, tos + 1);
		items = newItems; // сборщик мусора уберет потерявшуюся ссылку
	}

	public T pop() {
		if(items.length > INITIAL_CAPACITY && tos < items.length / 4) {
			changeItemsCapacity(items.length / 2);
		}
		return isEmpty() ? null : items[tos--];
	}

	public T top() {
		return isEmpty() ? null: items[tos];
	}
	
	public boolean isEmpty() {
		return -1 == tos;
	}
	
}
