package lesson150330.LinkedList;

import java.util.Iterator;

public class LinkedList implements Iterable {
	
	Node first, last;
	
	public void add(final Object item) {
		// first = new Node(item, first);
		
		Node fresh = new Node(item, null);
		if (first == null) {
			first = fresh;
			last = fresh;
		} else {
			last.next = fresh;
			last = fresh;
		}
	}
	
	public void print() {
		Node tmp = first;
		while(tmp != null) {
			System.out.println(tmp.item);
			tmp = tmp.next;
		}
	}

	@Override
	public Iterator iterator() {
		return new ListIterator(this);
	}
	
}
