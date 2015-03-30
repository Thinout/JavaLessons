package lesson150330.LinkedList.nested;

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
	
	private static class ListIterator implements Iterator {
		
		private LinkedList _linkedList;
		private Node _tmp;
		
		public ListIterator(final LinkedList linkedList) {
			_linkedList = linkedList;
			_tmp = _linkedList.first;
		}
		
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
		return new ListIterator(this);
	}
	
}
