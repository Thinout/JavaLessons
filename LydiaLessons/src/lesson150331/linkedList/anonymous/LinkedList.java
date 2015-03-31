package lesson150331.linkedList.anonymous;

import java.util.Iterator;

public class LinkedList implements Iterable {
	
	private static class Node {
		
		Object item;
		Node next;
		
		public Node(final Object item, final Node next) {
			super();
			this.item = item;
			this.next = next;
		}
	}
	
	Node first, last;
	
	public void add(final Object item) {		
		Node fresh = new Node(item, null);
		if (first == null) {
			first = fresh;
			last = fresh;
		} else {
			last.next = fresh;
			last = fresh;
		}
	}

	@Override
	public Iterator iterator() {
		return new Iterator() {
			
			private Node _tmp = LinkedList.this.first; // полная запись
			
			@Override
			public boolean hasNext() {		
				return _tmp != null;
			}

			@Override
			public Object next() {
				Object item = _tmp.item;
				_tmp = _tmp.next;
				return item;
			}
			
		};
	}
	
}
